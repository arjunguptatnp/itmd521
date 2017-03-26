# Item 3 of week 7 here.

![image](https://cloud.githubusercontent.com/assets/25064372/24327025/2851f358-118b-11e7-90c2-8e10f741a73a.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327029/3ae4d044-118b-11e7-836b-8b7ad8ddc3e4.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327030/47844654-118b-11e7-8404-549d99a57b37.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327033/61026dea-118b-11e7-913f-79f1a98bfe94.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327037/6daee168-118b-11e7-9040-fb6f87f7d9f7.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327041/79731f32-118b-11e7-9c52-b95d14abec91.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327044/87dddbc0-118b-11e7-9eec-9cc6abff8ea4.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327049/95beb548-118b-11e7-8139-8da5d2cf9a00.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327051/a42299d8-118b-11e7-8bf0-532bc08ae0f9.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327052/b36a5fc0-118b-11e7-939d-0dc082317ea6.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327054/bfbcc5a6-118b-11e7-9433-cd2624b9ed0d.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327057/cc6a2bf4-118b-11e7-9695-d52f3ab65e78.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327060/d93e8e06-118b-11e7-9a0b-878cf562cf70.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327062/e7276ea2-118b-11e7-82ef-057f16f38f4f.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327064/f2ab86f0-118b-11e7-96cf-51bf7358f127.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327066/023d2e70-118c-11e7-8c49-49273fe5ba96.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327069/23051406-118c-11e7-97ba-b6c115ee0162.png)

![image](https://cloud.githubusercontent.com/assets/25064372/24327070/30087d96-118c-11e7-88db-f4172b0eec1b.png)



#### Time taken by uncompressed files without combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327079/974f25ae-118c-11e7-864f-2ac0d5c47d11.png)


S.No | Dataset         | Time taken (seconds)
---  | ---             | ---
1    | 1990            | 1296
2    | 1990-93         | 1891
3    | 1990-91-92-93   | 1962

#### Time taken by uncompressed files with combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327096/7c98e33e-118d-11e7-8226-ff4e84784a2d.png) 


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 632
2    | 1990-93         | 844
3    | 1990-91-92-93   | 1057

#### Time taken by bzip2 files without combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327103/c3100072-118d-11e7-952f-489cb1b32c86.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 979
2    | 1990-93         | 1102
3    | 1990-91-92-93   | 1397

#### Time taken by bzip2 files with combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327108/e8b9428e-118d-11e7-9ae3-a59afee090f7.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 381
2    | 1990-93         | 500
3    | 1990-91-92-93   | 674

#### Time taken by gzip files without combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327110/06ad82d2-118e-11e7-8d10-024ae400722d.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 408
2    | 1990-93         | 799
3    | 1990-91-92-93   | 1562

#### Time taken by gzip files with combiner is represented in the following graph and table.

![image](https://cloud.githubusercontent.com/assets/25064372/24327115/2f324f76-118e-11e7-83ce-e66df198f617.png)


S.No | Dataset         | Time Taken (seconds)
---  | ---             | ---
1    | 1990            | 297
2    | 1990-93         | 474
3    | 1990-91-92-93   | 949



## Explanation: The explanation for this item has 2 parts.

### 1) The first part is a simple notion used in the earlier item has well. Combiner acts like a local reducer and groups the output of the Map phase and sends this to the reduce phase so the reduce phasehas to less work and so it takes less time. So whenever a file is run with a normal MaxTemperature without combiner will take more time than a file which run with MaxTemperatureWithCombiner code.
### 2) Coming to the second part, Chapter-5, Page 100 of the textbook, table 5-1 talks about compression(bzip2 and gz files). According to that fact, bzip compression compresses the file more efficiently.However, bzip is slower than gzip compression. So the time taken for gzip files to run is lesser than the time taken for bzio files to run 































