from flask import Flask,render_template
app=Flask(__name__,template_folder="C:\\Users\\KIIT\\Desktop\\Flask\\HTML")

@app.route("/")
def f1():
    name1="Dheeraj"
    char_name=[i for i in name1]
    dict_name=enumerate(name1)
    return render_template("HtmlUserInp.html",name=name1,ch_name=char_name,dict_namekv=set(dict_name))

if __name__=="__main__":
    app.run(debug=True)