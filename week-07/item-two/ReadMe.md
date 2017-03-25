# Analysis of week 7 item 2 here 

![image](https://cloud.githubusercontent.com/assets/25064372/24325121/bcb35bfc-1160-11e7-8f13-549ad5b3213b.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24325117/b0b96904-1160-11e7-9a40-cae9e6aa6cc4.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24325126/cb6f32a6-1160-11e7-8a49-ee6c4ec32daf.png)



#### The time taken by each dataset(.txt) with Combiner code is represented by the following table

S.No | DataSet       | Time Taken
---  | ---           | ---
1    | 1990          | 383
2    | 1990-92       | 1405
3    | 1990-91-92-93 | 1521




#### The time taken by each dataset is represented by the following graph

![image](https://cloud.githubusercontent.com/assets/25064372/24325095/2b776fde-1160-11e7-8e00-e6e68ab2815b.png)

Explanation: Like item-one, 1990.txt has smallest size so time taken is least and 1990-91-92-93.txt has the highest size so time taken is maximum.

However the interesting thing to note is the time taken by individual dataset and comparing them with item-one as here, code used is MaxTemperatureWithCombiner.

1990.txt with combiner has taken 383 seconds. The same file when run against MaxTemperature code took 531 seconds.

Combiner actually assits the process of Map Reduce. It is a sort of a local reducer. It combines output of Map process and sends this as input to reduce phase.

So reducer has less amount of work to do and hence the time taken with combiner phase included is less.






