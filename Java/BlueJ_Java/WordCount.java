   
/*
Objective - count all words occuring in input data
Source data - use any source data you have for this example

save file as WordCount.java
hdfs dfs -put <your input file with fully qualified path> /wordcount 
mkdir -m 755 wordcount_classes
javac -classpath $(hadoop classpath) -d wordcount_classes WordCount.java
jar -cvf ${HOME}/scripts/wordcount.jar -C wordcount_classes/ .
hadoop jar ./wordcount.jar org.myorg.WordCount /wordcount /wordcount.res
*/
 
      
import java.io.IOException;
import java.util.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.util.*;
public class WordCount 
{
    public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> 
    {
        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();
        public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException 
        {
            String line = value.toString();
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) 
            {
                word.set(tokenizer.nextToken());
                output.collect(word, one);
            }
        }
       }
       public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> 
       {
            private IntWritable result = new IntWritable();
            public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
            int sum=0;
            while (values.hasNext()) 
            {
                sum += values.next().get();
            }
            result.set(sum);
            output.collect(key, result);
        }
       }
    
       public static void main(String[] args) throws Exception {
         JobConf conf = new JobConf(WordCount.class);
         conf.setJobName("wordcount");
    
         conf.setMapperClass(Map.class);
         conf.setCombinerClass(Reduce.class);
         conf.setReducerClass(Reduce.class);
    
         conf.setInputFormat(TextInputFormat.class);
         conf.setOutputFormat(TextOutputFormat.class);

         conf.setOutputKeyClass(Text.class);
         conf.setOutputValueClass(IntWritable.class);
    
         FileInputFormat.setInputPaths(conf, new Path(args[0]));
         /*
            /userdata/input
         */
         FileOutputFormat.setOutputPath(conf, new Path(args[1]));
         /*
            /userdata/output
         */

         JobClient.runJob(conf);
       }
    }



