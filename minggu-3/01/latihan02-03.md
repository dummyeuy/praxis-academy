Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cd ..

C:\Users>cd ..

C:\>cd C:\Program Files\MongoDB\Server\4.2\bin

C:\Program Files\MongoDB\Server\4.2\bin>mongo
MongoDB shell version v4.2.0
connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("b04467be-ea4e-45aa-afa1-a42c78e8c31d") }
MongoDB server version: 4.2.0
Welcome to the MongoDB shell.
For interactive help, type "help".
For more comprehensive documentation, see
        http://docs.mongodb.org/
Questions? Try the support group
        http://groups.google.com/group/mongodb-user
Server has startup warnings:
2019-09-15T22:10:08.152-0700 I  CONTROL  [initandlisten]
2019-09-15T22:10:08.152-0700 I  CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
2019-09-15T22:10:08.152-0700 I  CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
2019-09-15T22:10:08.153-0700 I  CONTROL  [initandlisten]
---
Enable MongoDB's free cloud-based monitoring service, which will then receive and display
metrics about your deployment (disk utilization, CPU, operation statistics, etc).

The monitoring data will be available on a MongoDB website with a unique URL accessible to you
and anyone you share the URL with. MongoDB may use this information to make product
improvements and to suggest MongoDB products and deployment options to you.

To enable free monitoring, run the following command: db.enableFreeMonitoring()
To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
---

> db
test
> use <database>
2019-09-16T15:57:28.161+0700 E  QUERY    [js] Error: [<database>] is not a valid database name :
Mongo.prototype.getDB@src/mongo/shell/mongo.js:51:12
getDatabase@src/mongo/shell/session.js:913:28
DB.prototype.getSiblingDB@src/mongo/shell/db.js:22:12
shellHelper.use@src/mongo/shell/utils.js:803:10
shellHelper@src/mongo/shell/utils.js:790:15
@(shellhelp2):1:1
> use <db>
2019-09-16T15:58:19.748+0700 E  QUERY    [js] Error: [<db>] is not a valid database name :
Mongo.prototype.getDB@src/mongo/shell/mongo.js:51:12
getDatabase@src/mongo/shell/session.js:913:28
DB.prototype.getSiblingDB@src/mongo/shell/db.js:22:12
shellHelper.use@src/mongo/shell/utils.js:803:10
shellHelper@src/mongo/shell/utils.js:790:15
@(shellhelp2):1:1
> use database
switched to db database
> use myNewDatabase
switched to db myNewDatabase
> db.myCollection.insertOne({x: 1});
{
        "acknowledged" : true,
        "insertedId" : ObjectId("5d7f519e5a574e305d6767a6")
}
> db.getCollection("3 test").find()
> db.getCollection("3-test").find()
> db.getCollection("stats").find()
> db.getCollection("x").find()
> db.getCollection("1").find()
> db.getCollection("x: 1").find()
> db.myCollection.find().pretty()
{ "_id" : ObjectId("5d7f519e5a574e305d6767a6"), "x" : 1 }
> db.myCollection.find().print()
2019-09-16T16:16:46.980+0700 E  QUERY    [js] uncaught exception: TypeError: db.myCollection.find(...).print is not a function :
@(shell):1:1
> db.myCollection.print()
2019-09-16T16:17:55.286+0700 E  QUERY    [js] uncaught exception: TypeError: db.myCollection.print is not a function :
@(shell):1:1
> > if ( x > 0 ) {
... ... count++;
... ... print (x);
... ... }
2019-09-16T16:18:42.941+0700 E  QUERY    [js] uncaught exception: SyntaxError: expected expression, got '>' :
@(shell):1:0
> > if ( x > 0 ) {
... ... count++;
... ... print (x);
...
...
> if (x > 0) {
... count++;
... print(x);
... }
2019-09-16T16:19:43.832+0700 E  QUERY    [js] uncaught exception: ReferenceError: x is not defined :
@(shell):1:1
> db.inventory.insertMany ([
... { item: "journal", qty: 25, tags: ["blank", "red"], size: {h: 14, w:21, uom: "cm"}},
...    { item: "mat", qty: 85, tags: ["gray"], size: { h: 27.9, w: 35.5, uom: "cm" } },
...    { item: "mousepad", qty: 25, tags: ["gel", "blue"], size: { h: 19, w: 22.85, uom: "cm" } }
... ])
{
        "acknowledged" : true,
        "insertedIds" : [
                ObjectId("5d7f55265a574e305d6767a7"),
                ObjectId("5d7f55265a574e305d6767a8"),
                ObjectId("5d7f55265a574e305d6767a9")
        ]
}
> db.inventory.find({})
{ "_id" : ObjectId("5d7f55265a574e305d6767a7"), "item" : "journal", "qty" : 25, "tags" : [ "blank", "red" ], "size" : { "h" : 14, "w" : 21, "uom" : "cm" } }
{ "_id" : ObjectId("5d7f55265a574e305d6767a8"), "item" : "mat", "qty" : 85, "tags" : [ "gray" ], "size" : { "h" : 27.9, "w" : 35.5, "uom" : "cm" } }
{ "_id" : ObjectId("5d7f55265a574e305d6767a9"), "item" : "mousepad", "qty" : 25, "tags" : [ "gel", "blue" ], "size" : { "h" : 19, "w" : 22.85, "uom" : "cm" } }
> db.users.insertOne(
... {
... name: "sue",
... age: 26,
... status: "pending"
... }
... )
{
        "acknowledged" : true,
        "insertedId" : ObjectId("5d7f579a5a574e305d6767aa")
}
> db.insertOne.find({})
> db.users.insertOne({})
{
        "acknowledged" : true,
        "insertedId" : ObjectId("5d7f57d75a574e305d6767ab")
}
> db.users.insertOne.find({})
2019-09-16T16:37:56.627+0700 E  QUERY    [js] uncaught exception: TypeError: db.users.insertOne.find is not a function :
@(shell):1:1
> db.users.find({age: 26})
{ "_id" : ObjectId("5d7f579a5a574e305d6767aa"), "name" : "sue", "age" : 26, "status" : "pending" }
>