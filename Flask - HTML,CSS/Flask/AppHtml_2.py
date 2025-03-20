from flask import Flask,render_template
app=Flask(__name__,template_folder="C:\\Users\\KIIT\\Desktop\\Flask\\HTML")

@app.route("/")
def f1():
    return render_template("New_app.html")

if __name__=="__main__":
    app.run(debug=True)