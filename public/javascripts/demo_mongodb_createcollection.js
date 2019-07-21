var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  var dbo = db.db("mydb");
  //Create a collection name "films":
  dbo.createCollection("films", function(err, res) {
    if (err) throw err;
    console.log("Collection created!");
    db.close();
  });
});