package Odev1

class Rectangle(val shortEdge: Double, val longEdge: Double) : GeometricShape() {

    override fun areaCalculator() {
        area = shortEdge * longEdge
        println("Area of rectangle= $area")
    }

    override fun circumferenceCalculator() {
        circumference = 2 * (shortEdge + longEdge)
        println("Circumference of rectangle=$circumference")
    }


}