Terminal #1

Node #1
Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cockroach
CockroachDB command-line interface and server.

Usage:
  cockroach [command]

Available Commands:
  start       start a node
  init        initialize a cluster
  cert        create ca, node, and client certs
  quit        drain and shutdown node

  sql         open a sql shell
  user        get, set, list and remove users
  node        list, inspect or remove nodes
  dump        dump sql tables

  demo        open a demo sql shell
  gen         generate auxiliary files
  version     output version information
  debug       debugging commands
  sqlfmt      format SQL statements
  workload    [experimental] generators for data and query loads
  load        loading commands
  help        Help about any command

Flags:
  -h, --help                             help for cockroach
      --logtostderr Severity[=DEFAULT]   logs at or above this threshold go to stderr (default NONE)
      --no-color                         disable standard error log colorization
      --vmodule moduleSpec               comma-separated list of pattern=N settings for file-filtered logging (significantly hurts performance)

Use "cockroach [command] --help" for more information about a command.

C:\Users\asus>cockroach start --insecure --listen-addr=localhost
*
* WARNING: RUNNING IN INSECURE MODE!
*
* - Your cluster is open for any client that can access localhost.
* - Any user, even root, can log in without providing a password.
* - Any user, connecting as root, can read or write any data in your cluster.
* - There is no network encryption nor authentication, and thus no confidentiality.
*
* Check out how to secure your cluster: https://www.cockroachlabs.com/docs/v2.1/secure-a-cluster.html
*
CockroachDB node starting at 2019-09-16 06:16:19.4829483 +0000 UTC (took 7.2s)
build:               CCL v2.1.8 @ 2019/07/08 18:29:21 (go1.10.7)
webui:               http://localhost:8080
sql:                 postgresql://root@localhost:26257?sslmode=disable
client flags:        cockroach <client cmd> --host=localhost:26257 --insecure
logs:                C:\Users\asus\cockroach-data\logs
temp dir:            C:\Users\asus\cockroach-data\cockroach-temp292351115
external I/O path:   C:\Users\asus\cockroach-data\extern
store[0]:            path=C:\Users\asus\cockroach-data
status:              initialized new cluster
clusterID:           60574328-1de3-4378-9210-83b27e6ad854
nodeID:              1
Note: a second interrupt will skip graceful shutdown and terminate forcefully
initiating graceful shutdown of server
server drained and shutdown completed
*
* INFO: interrupted
*
Failed running "start"

======================================
Terminal #2

Node #2
Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cockroach start --insecure --store=node2 --listen-addr=localhost:26258 --http-addr=localhost:8081 --join=localhost:26257
*
* WARNING: RUNNING IN INSECURE MODE!
*
* - Your cluster is open for any client that can access localhost.
* - Any user, even root, can log in without providing a password.
* - Any user, connecting as root, can read or write any data in your cluster.
* - There is no network encryption nor authentication, and thus no confidentiality.
*
* Check out how to secure your cluster: https://www.cockroachlabs.com/docs/v2.1/secure-a-cluster.html
*
*
* INFO: initial startup completed, will now wait for `cockroach init`
* or a join to a running cluster to start accepting clients.
* Check the log file(s) for progress.
*
CockroachDB node starting at 2019-09-16 06:22:26.902022 +0000 UTC (took 3.7s)
build:               CCL v2.1.8 @ 2019/07/08 18:29:21 (go1.10.7)
webui:               http://localhost:8081
sql:                 postgresql://root@localhost:26258?sslmode=disable
client flags:        cockroach <client cmd> --host=localhost:26258 --insecure
logs:                C:\Users\asus\node2\logs
temp dir:            C:\Users\asus\node2\cockroach-temp403776323
external I/O path:   C:\Users\asus\node2\extern
store[0]:            path=C:\Users\asus\node2
status:              initialized new node, joined pre-existing cluster
clusterID:           60574328-1de3-4378-9210-83b27e6ad854
nodeID:              2
Note: a second interrupt will skip graceful shutdown and terminate forcefully
initiating graceful shutdown of server
server drained and shutdown completed
*
* INFO: interrupted
*
Failed running "start"

C:\Users\asus>


=============================
Terminal #3

Node #3
Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cockroach start --insecure --store=node3 --listen-addr=localhost:26259 --http-addr=localhost:8082 --join=localhost:26257
*
* WARNING: RUNNING IN INSECURE MODE!
*
* - Your cluster is open for any client that can access localhost.
* - Any user, even root, can log in without providing a password.
* - Any user, connecting as root, can read or write any data in your cluster.
* - There is no network encryption nor authentication, and thus no confidentiality.
*
* Check out how to secure your cluster: https://www.cockroachlabs.com/docs/v2.1/secure-a-cluster.html
*
*
* INFO: initial startup completed, will now wait for `cockroach init`
* or a join to a running cluster to start accepting clients.
* Check the log file(s) for progress.
*
CockroachDB node starting at 2019-09-16 06:22:47.6770431 +0000 UTC (took 6.7s)
build:               CCL v2.1.8 @ 2019/07/08 18:29:21 (go1.10.7)
webui:               http://localhost:8082
sql:                 postgresql://root@localhost:26259?sslmode=disable
client flags:        cockroach <client cmd> --host=localhost:26259 --insecure
logs:                C:\Users\asus\node3\logs
temp dir:            C:\Users\asus\node3\cockroach-temp316644583
external I/O path:   C:\Users\asus\node3\extern
store[0]:            path=C:\Users\asus\node3
status:              initialized new node, joined pre-existing cluster
clusterID:           60574328-1de3-4378-9210-83b27e6ad854
nodeID:              3


=========================

Terminal #4

Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cockroach sql --insecure --host=localhost:26257
# Welcome to the cockroach SQL interface.
# All statements must be terminated by a semicolon.
# To exit: CTRL + D.
#
# Server version: CockroachDB CCL v2.1.8 (x86_64-w64-mingw32, built 2019/07/08 18:29:21, go1.10.7) (same version as client)
# Cluster ID: 60574328-1de3-4378-9210-83b27e6ad854
#
# Enter \? for a brief introduction.
#
root@localhost:26257/defaultdb> create database bank;
CREATE DATABASE

Time: 724.5271ms

root@localhost:26257/defaultdb> CREATE TABLE bank.accounts (id INT PRIMARY KEY, balance DECIMAL);
CREATE TABLE

Time: 372.2484ms

root@localhost:26257/defaultdb> INSERT INTO bank.accounts VALUES (1, 1000.50);
INSERT 1

Time: 638.8044ms

root@localhost:26257/defaultdb> SELECT * FROM bank.accounts;
  id | balance
+----+---------+
   1 | 1000.50
(1 row)

Time: 20.9421ms

root@localhost:26257/defaultdb>

C:\Users\asus>

C:\Users\asus>\q
'\q' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\asus>cockroach
CockroachDB command-line interface and server.

Usage:
  cockroach [command]

Available Commands:
  start       start a node
  init        initialize a cluster
  cert        create ca, node, and client certs
  quit        drain and shutdown node

  sql         open a sql shell
  user        get, set, list and remove users
  node        list, inspect or remove nodes
  dump        dump sql tables

  demo        open a demo sql shell
  gen         generate auxiliary files
  version     output version information
  debug       debugging commands
  sqlfmt      format SQL statements
  workload    [experimental] generators for data and query loads
  load        loading commands
  help        Help about any command

Flags:
  -h, --help                             help for cockroach
      --logtostderr Severity[=DEFAULT]   logs at or above this threshold go to stderr (default NONE)
      --no-color                         disable standard error log colorization
      --vmodule moduleSpec               comma-separated list of pattern=N settings for file-filtered logging (significantly hurts performance)

Use "cockroach [command] --help" for more information about a command.

C:\Users\asus>\q
'\q' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\asus>q
'q' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\asus>cockroach \q
Error: unknown command "\\q" for "cockroach"

Did you mean this?
        sql

Run 'cockroach --help' for usage.
Failed running "cockroach"

C:\Users\asus>cockroach sql --insecure --host=localhost:26258
# Welcome to the cockroach SQL interface.
# All statements must be terminated by a semicolon.
# To exit: CTRL + D.
#
# Server version: CockroachDB CCL v2.1.8 (x86_64-w64-mingw32, built 2019/07/08 18:29:21, go1.10.7) (same version as client)
# Cluster ID: 60574328-1de3-4378-9210-83b27e6ad854
#
# Enter \? for a brief introduction.
#
root@localhost:26258/defaultdb> SELECT * FROM bank.accounts;
  id | balance
+----+---------+
   1 | 1000.50
(1 row)

Time: 166.5828ms

root@localhost:26258/defaultdb> \q
C:\Users\asus>cockroach sql --insecure --host=localhost:26258
# Welcome to the cockroach SQL interface.
# All statements must be terminated by a semicolon.
# To exit: CTRL + D.
#
# Server version: CockroachDB CCL v2.1.8 (x86_64-w64-mingw32, built 2019/07/08 18:29:21, go1.10.7) (same version as client)
# Cluster ID: 60574328-1de3-4378-9210-83b27e6ad854
#
# Enter \? for a brief introduction.
#
root@localhost:26258/defaultdb> SELECT * FROM bank.accounts;
  id | balance
+----+---------+
   1 | 1000.50
(1 row)

Time: 3.2145ms

root@localhost:26258/defaultdb> \q
C:\Users\asus>rm -rf cockroach-data node2 node3
'rm' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\asus>cockroach start --insecure --listen-addr=localhost
*
* WARNING: RUNNING IN INSECURE MODE!
*
* - Your cluster is open for any client that can access localhost.
* - Any user, even root, can log in without providing a password.
* - Any user, connecting as root, can read or write any data in your cluster.
* - There is no network encryption nor authentication, and thus no confidentiality.
*
* Check out how to secure your cluster: https://www.cockroachlabs.com/docs/v2.1/secure-a-cluster.html
*
*
* WARNING: The server appears to be unable to contact the other nodes in the cluster. Please try:
*
* - starting the other nodes, if you haven't already;
* - double-checking that the '--join' and '--listen'/'--advertise' flags are set up correctly;
* - running the 'cockroach init' command if you are trying to initialize a new cluster.
*
* If problems persist, please see https://www.cockroachlabs.com/docs/v2.1/cluster-setup-troubleshooting.html.
*
CockroachDB node starting at 2019-09-16 07:07:58.4508079 +0000 UTC (took 355.3s)
build:               CCL v2.1.8 @ 2019/07/08 18:29:21 (go1.10.7)
webui:               http://localhost:8080
sql:                 postgresql://root@localhost:26257?sslmode=disable
client flags:        cockroach <client cmd> --host=localhost:26257 --insecure
logs:                C:\Users\asus\cockroach-data\logs
temp dir:            C:\Users\asus\cockroach-data\cockroach-temp642669455
external I/O path:   C:\Users\asus\cockroach-data\extern
store[0]:            path=C:\Users\asus\cockroach-data
status:              restarted pre-existing node
clusterID:           60574328-1de3-4378-9210-83b27e6ad854
nodeID:              1

====================================
Terimanl #5

Microsoft Windows [Version 10.0.17134.1006]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\asus>cockroach start --insecure --store=node2 --listen-addr=localhost:26258 --http-addr=localhost:8081 --join=localhost:26257
*
* WARNING: RUNNING IN INSECURE MODE!
*
* - Your cluster is open for any client that can access localhost.
* - Any user, even root, can log in without providing a password.
* - Any user, connecting as root, can read or write any data in your cluster.
* - There is no network encryption nor authentication, and thus no confidentiality.
*
* Check out how to secure your cluster: https://www.cockroachlabs.com/docs/v2.1/secure-a-cluster.html
*
CockroachDB node starting at 2019-09-16 07:07:58.4453996 +0000 UTC (took 9.4s)
build:               CCL v2.1.8 @ 2019/07/08 18:29:21 (go1.10.7)
webui:               http://localhost:8081
sql:                 postgresql://root@localhost:26258?sslmode=disable
client flags:        cockroach <client cmd> --host=localhost:26258 --insecure
logs:                C:\Users\asus\node2\logs
temp dir:            C:\Users\asus\node2\cockroach-temp103460747
external I/O path:   C:\Users\asus\node2\extern
store[0]:            path=C:\Users\asus\node2
status:              restarted pre-existing node
clusterID:           60574328-1de3-4378-9210-83b27e6ad854
nodeID:              2



