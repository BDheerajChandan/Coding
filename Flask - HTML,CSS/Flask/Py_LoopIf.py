from flask import Flask,render_template
app=Flask(__name__,template_folder="C:\\Users\\KIIT\\Desktop\\Flask\\HTML")

@app.route("/")
def f1():
    name1="Dheeraj"
    return render_template("Htmml_LoopIf.html",name=name1)

if __name__=="__main__":
    app.run(debug=True)