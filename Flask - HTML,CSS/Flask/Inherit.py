from flask import Flask,render_template
import Inherit
app=Flask(__name__,template_folder="C:\\Users\\KIIT\\Desktop\\Flask\\HTML")


@app.route("/")
def f():
    return "Enter after / : base1, base2, ext1, ext2, ext3"


@app.route("/base1")
def f1():
    name="dheeRaj"
    return render_template("Base1_InhExt.html",name=name)

@app.route("/base2")
def f2():    
    return render_template("Base2_InhExt.html")


@app.route("/ext1")
def f3():
    name="Dheeraj"
    return render_template("ExtendedBase1_InhExt.html",name=name)
@app.route("/ext2")
def f4():
    name="Dheeraj"
    return render_template("ExtendedBase2_InhExt.html",name=name)
@app.route("/ext3")
def f5():
    name="Dheeraj"
    return render_template("ExtendedBase3_InhExt.html",name=name)


if __name__=="__main__":
    app.run(debug=True)