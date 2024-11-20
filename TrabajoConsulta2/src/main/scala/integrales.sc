def f1(n:Double):Double = -(n*n)+(8*n)-12
def f2(n:Double):Double = 3*(n*n)
def f3(n:Double):Double = n + 2*(n*n) - (n*n*n) + 5*(n*n*n*n)
def f4(n:Double):Double = ((2*n) + 1)/((n*n) + n)
def f5(n:Double):Double = Math.exp(n)
def f6(n:Double):Double = 1/(Math.sqrt(n-1))
def f7(n:Double):Double = 1/(1+(n*n))

def integracion(f:Double=>Double,intervalo_inf:Double,intervalo_sup:Double):Double={
  val intervalo:Double = (intervalo_inf + intervalo_sup)/2

  val solucion: Double = (intervalo_sup - intervalo_inf) * (((f(intervalo_inf)+ (4 * f(intervalo)) + f(intervalo_sup))/6)
}

def error(valorEsperado:Double,valorObtenido:Double)={
Math.abs(valorEsperado-valorObtenido)
}

val sol1: Double = funcion(f1, 3, 5)
error(7.33,sol1)

val sol2: Double = funcion(f2,0,2)
error(8,sol2)

val sol3: Double =funcion(f3,-1,1)
error(3.333,sol3)

val sol4: Double =funcion(f4,1,2)
error(1.09861,sol4)

val sol5: Double =funcion(f5,0,1)
error(1.71828,sol5)

val sol6: Double =funcion(f6,2,3)
error(0.828427,sol6)

val sol7: Double =funcion(f7,0,1)
error(0.785398,sol7)
