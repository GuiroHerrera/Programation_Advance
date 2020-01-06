console.log(process.argv);//node 02addition.js 5 con argumentos
var acum=0;
for (i=2 ; i< process.argv.length ; i++){
    acum = acum+Number(process.argv[i]);
}
console.log(acum);