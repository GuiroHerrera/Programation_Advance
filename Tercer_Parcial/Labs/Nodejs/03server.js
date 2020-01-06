var express = require('express')
var app = express()
var portarg = process.argv[2];
app.get('/', function(req,res){
    res.send('Hello World!')
})
//npm init para generar el gestor paquetes json
//npm install express --save   instalacion express
var server = app.listen(portarg, function(){
    var host = server.address().address
    var port = server.address().port

    console.log('Example app listening it http://%s:%s',host,port)
})
