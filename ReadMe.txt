
Command to start the zookeeper-----------------------------------
cd D:\Kafka\kafka_2.12-3.4.0\bin\windows
zookeeper-server-start.bat ..\..\config\zookeeper.properties

command to start the kafka server
cd D:\Kafka\kafka_2.12-3.4.0\bin\windows
kafka-server-start.bat ..\..\config\server.properties

command to create a topic
cd D:\Kafka\kafka_2.12-3.4.0\bin\windows
kafka-topics.bat --create --topic payment-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1


[This will create java-techie1 with:
Default partitions (as per num.partitions in config/server.properties)
Replication factor = 1 (since you’re running a single broker)]

list of all topic 
kafka-topics.bat --list --bootstrap-server localhost:9092