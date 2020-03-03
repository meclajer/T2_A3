import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {

    // ===================================================== EJERCICIO 1 =====================================================
    print("\n\n\t ========== EJERCICIO 1 ========== \n\n")
    //Escriba un programa que permita crear una lista de palabras y que, a continuacion, pida una
    //palabra y diga cuantas veces aparece esa palabra en la lista

    //Estatica
    var palabras = List("hola","mundo","PC","Laptop","hola","mundo","PC","Laptop","hola","mundo","PC","Laptop");

    print("Incerte la palabra a buscar: ")
    var aBuscar = readLine()


    var contador:Int = 0
    for ( palabra <- palabras ){
      if (palabra.equalsIgnoreCase(aBuscar)){
        contador += 1
      }
    }

    print("\nLa palabra fue encontrada: "+contador+".\nCadena:\n")
    for ( palabra <- palabras ){
      print(palabra+" ")
    }

    // ===================================================== EJERCICIO 3 =====================================================
    print("\n\n\t ========== EJERCICIO 3 ========== \n\n")
    /*
      Escriba un programa que permita crear una lista de palabras y que a continuacion, pida una
       palabra y elimine esa palabra de la lista
     */

    print("Incerte la palabra a buscar: ")
    var aEliminar = readLine()

    var palabrasLimpias = palabras.filterNot(pal => pal.equalsIgnoreCase(aEliminar))

    print("\nCadena resultante: \n")
    for ( palabra <- palabrasLimpias ){
      print(palabra+" ")
    }

    // ===================================================== EJERCICIO 5 =====================================================
    print("\n\n\t ========== EJERCICIO 5 ========== \n\n")
    /*
      Escriba un programa que permita crear dos lista de palabras y que a continuacion, escriba las
        Lista de palabras que aparescan en dos listas.
        Lista de palabras que aparescan en la primera lista, pero no en la segunda.
        Lista de palabras que aparescan en la segunda lista, pero no en la primera.
        Lista de palabras que aparescan en ambas listas.
      Nota: Para evitar las repeticiones, eprograma debera empezar por eliminar los elementos repetidos en cada lista
     */

    var listaUno = List("carro","tecla","lista","moto","avion","telefono","carcasa","casa","cuarto","salon")
    var listaDos = List("carro","tecla","lista","moto","avion","avion","carcasa","carcasa","trapeador","hola")

    //Limpiado de cadena
    listaUno = listaUno.distinct
    listaDos = listaDos.distinct

    //Palabras en ambas listas
    println("Interseccion, en ambas listas:")
    var listaEnLasDos = listaUno.intersect(listaDos)
    for (p <- listaEnLasDos){
      print(p+" ")
    }

    //Palabras en la lista 1
    println("\nPalabras solo en la lista 1: ")
    var soloEnLista1 = listaUno.diff(listaDos)
    for (p <- soloEnLista1){
      print(p+" ")
    }

    //Palabras en la lista 2
    println("\nPalabras solo en la lista 1: ")
    var soloEnLista2 = listaDos.diff(listaUno)
    for (p <- soloEnLista2){
      print(p+" ")
    }

    //Union de ambas
    println("\nPalabras solo en la lista 1: ")
    var listaUnion = listaDos.union(listaUno)
    listaUnion = listaUnion.distinct
    for (p <- listaUnion){
      print(p+" ")
    }


  }
}
