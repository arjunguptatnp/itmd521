# item 5 week 7 analysis here.


![image](https://cloud.githubusercontent.com/assets/25064372/24327844/1db26f5c-11a1-11e7-93f8-55e516c6ecb7.png)


#### The time taken by all files with bzip2 native hadoop compression without combiner is represented by the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327861/4450c64a-11a1-11e7-9ea8-c5806025fffd.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 1089
2    | 1990-93         | 1344
3    | 1990-91-92-93   | 2071

#### The time taken by all files with bzip2 native hadoop compression with combiner is represented by the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327862/4c5c0548-11a1-11e7-9906-19a3667a0373.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 777
2    | 1990-93         | 970
3    | 1990-91-92-93   | 1264


### Explanation: The explanation has 2 parts like previous examples.

#### 1) Page 34 of the book talks about Combiner functions. So combiner acts like a local reducer. Time taken when file runs against MaxTemperatureWithCombiner code is less than that of MaxTemperature code.

#### 2) Native Hadoop Compression is discussed on Page 101 in the book. The compression codecs % change is shown in the following graph.


![image](https://cloud.githubusercontent.com/assets/25064372/24327964/78105c64-11a3-11e7-819b-95e81852121a.png)

The Native hadoop compression took less time to run as compared to the java compression so it is faster as represented by the graph.





















