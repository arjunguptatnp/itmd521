# Item 4 analysis of week 7 is here.


![image](https://cloud.githubusercontent.com/assets/25064372/24327580/9f3a0ce4-119a-11e7-851c-0c7e17ea9c2a.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327583/a87bec82-119a-11e7-842a-a667c3bde798.png)

#### The time taken by each dataset in a Gzip intermediate compression without combiner is represented by the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327586/b33af1c2-119a-11e7-9e95-9dbb9f3c2f99.png)


S.No | Dataset        | Time Taken (seconds)
---  | ---            | ---
1    | 1990           | 1818
2    | 1990-93        | 2013
3    | 1990-91-92-93  | 2891


#### The time taken by each dataset in a Gzip intermediate compression with combiner is represented by the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327590/bd56a0f2-119a-11e7-98a3-ef178ab1fd81.png)


S.No | Dataset        | Time Taken (seconds)
---  | ---            | ---
1    | 1990           | 313
2    | 1990-93        | 536
3    | 1990-91-92-93  | 1172



### Explanation: The explanation has 2 parts.

#### 1) Like previous cases, page 34 of the book talks about combiner functions where combiner acts like a local reducer so it groups data from map phase and sends it to the reduce phase so the reduce phase has less work to do. So the time taken for a file to run against the MaxTemperature code will be more than the time taken by the file to run against the MaxTemperatureWithCombiner code.

#### 2) In this item, all the jobs were run on .gz files. As discussed on page 34 of the text book under “Combiner functions”. Jobs run withCombiner tool less time to complete than jobs without Combiner as here intermediate compression logic was introduced. Intermediate Compression takes place at file level.

Outputs of maps are compressed before being sent across the system  and the use of SequenceFile compression takes place. This is like compression of data between mapper and the reducer.  

























