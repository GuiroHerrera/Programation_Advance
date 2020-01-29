let a=5
let b=3

let c: int= a+b

//funciones
let cuadrado x = x*x

//llamando a una función
cuadrado c
//funcion suma con dos parámetros
let suma x y = x+y

suma a 15

// funcion suma aplicando el cuadrado
cuadrado (suma 2 3) 

//el resultado de la suma aplica funcion cuadrado de izquierda a derecha
suma 2 3 |> cuadrado   // |> pipe forward

// congela la funcion hasta recibir otro parametro con la fucnion cosa
let cosa = suma 2 

cosa 100


// al 3 sumale 2 y eleva al cuadrado
3|> suma 2 |> cuadrado


let s="Ana"
let nombres=["Luis";"Maria";"Elena"]

//:: (cons) contructor para agregar elementos de a una lista
let masNombres= s :: nombres

//record con tres propiedaddes

type Persona ={id:int ; nombre:string ; edad :int}


let p1= {id=101;nombre="Alejandra";edad=25}
let p2= {id=103;nombre="Santiago";edad=22}

// lista de personas
let gente = [p1;p2]


gente |> List.map (fun p -> p.edad) |> List.sum






let numeros=[2;9;5;-3;0]


// List es un modulo 
List.sum numeros

let nuevaLista=List.map cuadrado numeros
List.sum nuevaLista;


List.sum (List.map cuadrado numeros);

List.map cuadrado numeros |> List.sum


numeros |> List.map cuadrado |> List.sum


let elevarAlCuadrado =  List.map cuadrado
let sumarValores = List.sum 


numeros|> elevarAlCuadrado |> sumarValores

let esPositivo numero = if numero > 0 then true else false
List.filter esPositivo numeros


numeros
|> List.filter esPositivo
|> List.map cuadrado
|> List.sum


numeros
|> List.filter (fun x -> x < 0)
|> List.map (fun n -> n * n * n) // notacion para definir una expresion lambda
|> List.sum


// recorrer una lista 
let rec sumaLista l = 
    match l with  
    | [] -> 0
    | primero ::  resto -> primero + sumaLista resto
    // 2::[2;9]
    // 5+ sumaLista[2;9]
    // 2::[9]
    // 2+ sumaList[9]
    // 9::[]
    // 9 + sumaLista[]



[<EntryPoint>]
let main argv =

0

