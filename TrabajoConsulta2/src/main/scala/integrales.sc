def ejer1(n:Double):Double = -(n*n)+(8*n)-12
def ejer2(n:Double):Double = 3*(n*n)
def ejer3(n:Double):Double = n + 2*(n*n) - (n*n*n) + 5*(n*n*n*n)
def ejer4(n:Double):Double = ((2*n) + 1)/((n*n) + n)
def ejer5(n:Double):Double = Math.exp(n)
def ejer6(n:Double):Double = 1/Math.sqrt(n-1)
def ejer7(n:Double):Double = 1/(1+(n*n))

def funcion(ejer:Double=>Double,intervalo_inf:Double,intervalo_sup:Double):Double={
  val intervalo:(Double,Double)=>Double = (a:Double,b:Double)=>(a+b)/2
  val x0: Double = ejer(intervalo_inf)
  val x1: Double = ejer(intervalo(intervalo_inf, intervalo_sup))
  val x2: Double = ejer(intervalo_sup)

  def integracion(a: Double, b: Double, x0: Double, x1: Double, x2: Double): Double = {
    (b - a) * ((x0 + (4 * x1) + x2) / 6)
  }
  val solucion: Double = integracion(intervalo_inf, intervalo_sup, x0, x1, x2)
  solucion
}

def error(valorEsperado:Double,valorObtenido:Double)=Math.abs(valorEsperado-valorObtenido)

val sol1: Double = funcion(ejer1, 3, 5)
error(7.33,sol1)

val sol2: Double = funcion(ejer2,0,2)
error(8,sol2)

val sol3: Double =funcion(ejer3,-1,1)
error(3.333,sol3)

val sol4: Double =funcion(ejer4,1,2)
error(1.09861,sol4)

val sol5: Double =funcion(ejer5,0,1)
error(1.71828,sol5)

val sol6: Double =funcion(ejer6,2,3)
error(0.828427,sol6)

val sol7: Double =funcion(ejer7,0,1)
error(0.785398,sol7)
