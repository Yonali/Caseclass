import math.{sqrt,pow}

object Caseclass extends App{
  val P1= new Point(9,7)
  val P2=new Point(3,2)
  val P3=P1.move(2,3)
  val P4= new Point(6,10)
  val d= P1.distance(P2)

  println(f"Distance = ${d}%.2f")
  println(P1)
  println(P2)
  println(s"Addition = ${P1+P2}")
  println(s"Invert = ${P4.invert()}")
}

case class Point(m:Int,n:Int){
  def x:Int=m
  def y:Int=n

  def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)                                                 //Q 1

  def +(that:Point)= Point(this.x+that.x, this.y+that.y)                                              //Q 2

  def distance(other:Point):Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))        //Q 3

  def invert()= Point(this.y,this.x)                                                                  //Q 4
}
