package Odev1

class Circle(val radius: Double) : GeometricShape() {


    override fun areaCalculator() {
        area = radius * radius * Math.PI
        println("Area of circle= $area")
    }

    override fun circumferenceCalculator() {
        circumference = 2 * Math.PI * radius
        println("Circumference of circle=$circumference")
    }


}