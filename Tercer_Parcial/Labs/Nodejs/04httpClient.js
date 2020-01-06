var http = require('http')
var url = process.argv[2]
http.get(url, function(response){
    console.log("response status" + response.statusCode)
    response.setEncoding("utf8")
    response.on("data",function(data){
        console.log(data)
    })
    response.on('error', console.error)
})
//node 04httpClient.js http://www.google.com/ >>index.html el index es para guardar el archivo