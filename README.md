# mongodb-test
Test transaction when using both mongodb and mysql on spring boot

# Setup mongodb 4.2 for transaction: https://www.baeldung.com/spring-data-mongodb-transactions

First, we’ll need to setup latest MongoDB to try the new native transactions support.

To get started, we have to download the latest version from the MongoDB Download Center.

Next, we’ll start mongod service using the command line:

_ _mongod --replSet rs0_ _

Finally, initiate replica set – if not already:

_ _mongo --eval "rs.initiate()"_ _

Note that MongoDB currently supports transactions over a replica set.
