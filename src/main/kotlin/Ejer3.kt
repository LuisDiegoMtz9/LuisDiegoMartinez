fun main(){

    val valorc=27.0
    val valork=350.0
    val valorf=10.0
    val celcius="Celsius"
    val fa="Fahrenheit"
    val kelvin="Kelvin"
    val ecuacionc= {ini:Double -> (((9.0/5.0)*ini)+32.0)}
    val ecuacionk= {ini:Double -> ini-273.15}
    val ecuacionf= {ini:Double -> (((5.0/9.0)*(ini-32))+273.15)}
    printFinalTemperature(valorc, celcius, fa, ecuacionc)
    printFinalTemperature(valork, kelvin, celcius, ecuacionk)
    printFinalTemperature(valorf, fa, kelvin, ecuacionf)
}

fun printFinalTemperature(
    initialMeasurement : Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
)   {
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees is $finalMeasurement degrees $finalUnit")

}