# CSVtoDF
Java framework to read CSV data into a Dataframe like object

Mimics some of the functionality of dataframes found in R and Python

Java files:

ReadCSV.java - reads in a comma delimited file and creates a 2d string array off of it
Dataframe.java - defines a dataframe object off of a 2d string array
CSVtoDF.java - defines main method and shows example object calls

Dataframe features: 
    - Columns scanned and defined either <num> or <str>
    - Describe() shows data dimensions, column names, and prints first 5 rows
    - SummaryStats() will show univariate statistics for <num> columns, or a frequency table for <str> columns
    - Columns can be accessed by column number
    
Future functionality:
    - Column access by name
    - Add date field type
    - Create new column from transformation of existing columns and add to data frame
    - Grouping operations in summary

Dataframe with 400 rows and 8 columns
Column names: [id, admit, gre, gpa, rank, status, gender, date]

Output from run of CSVtoDF:

First 5 rows:

id                  admit               gre                 gpa                 rank                status              gender              date                
<num>               <num>               <num>               <num>               <num>               <str>               <str>               <str>               
[0]                 [1]                 [2]                 [3]                 [4]                 [5]                 [6]                 [7]                 

1                   0                   380                 3.61                3                   Active              Male                2011-01-01          
2                   1                   660                 3.67                3                   Inactive            Female              2011-01-08          
3                   1                   800                 4                   1                   Other               Male                2011-01-15          
4                   1                   640                 3.19                4                   Active              Male                2011-01-22          
5                   0                   520                 2.93                4                   Inactive            Female              2011-01-29          

First 7 rows:

id                  admit               gre                 gpa                 rank                status              gender              date                
<num>               <num>               <num>               <num>               <num>               <str>               <str>               <str>               
[0]                 [1]                 [2]                 [3]                 [4]                 [5]                 [6]                 [7]                 

1                   0                   380                 3.61                3                   Active              Male                2011-01-01          
2                   1                   660                 3.67                3                   Inactive            Female              2011-01-08          
3                   1                   800                 4                   1                   Other               Male                2011-01-15          
4                   1                   640                 3.19                4                   Active              Male                2011-01-22          
5                   0                   520                 2.93                4                   Inactive            Female              2011-01-29          
6                   1                   760                 3                   2                   Other               Female              2011-02-05          
7                   1                   560                 2.98                1                   Active              Male                2011-02-12          

Column: id
Type: num
N: 400.0
Sum: 80200.00
Min: 1.0
Pct25: 100.25
Mean: 200.50
Median: 200.5
Pct75: 300.75
Std Dev: 115.61
Max: 400.0

Column: admit
Type: num
N: 400.0
Sum: 127.00
Min: 0.0
Pct25: 0.0
Mean: 0.32
Median: 0.0
Pct75: 1.0
Std Dev: 0.47
Max: 1.0

Column: gre
Type: num
N: 400.0
Sum: 235080.00
Min: 220.0
Pct25: 520.0
Mean: 587.70
Median: 580.0
Pct75: 660.0
Std Dev: 115.52
Max: 800.0

Column: gpa
Type: num
N: 400.0
Sum: 1355.96
Min: 2.26
Pct25: 3.13
Mean: 3.39
Median: 3.395
Pct75: 3.67
Std Dev: 0.38
Max: 4.0

Column: rank
Type: num
N: 400.0
Sum: 994.00
Min: 1.0
Pct25: 2.0
Mean: 2.49
Median: 2.0
Pct75: 3.0
Std Dev: 0.94
Max: 4.0


Frequency counts for 'status': {Active=196, Inactive=116, Other=88}


Frequency counts for 'gender': {Male=240, Female=160}


Frequency counts for 'date': {2011-04-16=1, 2016-04-30=1, 2015-12-05=1, 2017-09-16=1, 2013-02-16=1, 2018-03-03=1, 2014-07-05=1, 2012-09-01=1, 2014-06-28=1, 2013-02-23=1, 2012-09-08=1, 2017-09-23=1, 2017-10-07=1, 2011-04-09=1, 2016-04-23=1, 2011-04-23=1, 2015-12-12=1, 2014-07-12=1, 2013-02-02=1, 2018-02-24=1, 2013-02-09=1, 2015-12-19=1, 2017-10-14=1, 2016-05-07=1, 2012-09-15=1, 2017-09-30=1, 2011-03-26=1, 2015-12-26=1, 2017-08-26=1, 2013-03-09=1, 2014-07-26=1, 2018-03-24=1, 2014-07-19=1, 2012-08-11=1, 2016-04-09=1, 2012-08-18=1, 2017-09-02=1, 2016-04-02=1, 2011-03-19=1, 2018-03-17=1, 2011-04-02=1, 2017-09-09=1, 2014-08-02=1, 2018-03-10=1, 2013-03-02=1, 2016-04-16=1, 2012-08-25=1, 2016-06-11=1, 2013-12-21=1, 2015-10-24=1, 2015-01-31=1, 2013-01-05=1, 2018-04-14=1, 2014-05-24=1, 2012-07-21=1, 2014-05-17=1, 2017-11-11=1, 2015-01-24=1, 2012-07-28=1, 2013-12-14=1, 2017-11-18=1, 2011-02-26=1, 2016-06-04=1, 2011-03-12=1, 2015-10-31=1, 2018-04-07=1, 2018-03-31=1, 2014-05-31=1, 2015-11-07=1, 2015-01-17=1, 2015-01-10=1, 2017-11-25=1, 2016-06-18=1, 2012-08-04=1, 2011-03-05=1, 2013-12-07=1, 2011-02-12=1, 2015-11-14=1, 2016-05-21=1, 2013-01-26=1, 2014-06-14=1, 2018-05-05=1, 2014-06-07=1, 2015-01-03=1, 2012-06-30=1, 2017-10-21=1, 2012-07-07=1, 2017-10-28=1, 2011-02-05=1, 2016-05-14=1, 2015-11-21=1, 2014-06-21=1, 2013-01-12=1, 2018-04-21=1, 2015-11-28=1, 2018-04-28=1, 2013-01-19=1, 2017-11-04=1, 2011-02-19=1, 2016-05-28=1, 2012-07-14=1, 2013-12-28=1, 2011-07-09=1, 2017-01-14=1, 2012-06-09=1, 2014-04-12=1, 2013-05-11=1, 2015-03-07=1, 2014-04-05=1, 2017-12-23=1, 2012-06-16=1, 2016-02-06=1, 2011-07-16=1, 2017-01-21=1, 2016-02-20=1, 2013-04-27=1, 2017-01-28=1, 2015-02-28=1, 2017-12-30=1, 2013-05-04=1, 2014-04-19=1, 2011-07-02=1, 2012-06-23=1, 2016-02-13=1, 2011-06-18=1, 2018-01-06=1, 2011-06-11=1, 2012-05-19=1, 2015-02-21=1, 2016-12-31=1, 2014-05-03=1, 2014-04-26=1, 2017-12-02=1, 2015-02-14=1, 2013-06-01=1, 2012-05-26=1, 2016-01-16=1, 2017-12-09=1, 2016-01-30=1, 2011-06-25=1, 2017-01-07=1, 2013-05-18=1, 2014-05-10=1, 2016-12-24=1, 2015-02-07=1, 2013-05-25=1, 2017-12-16=1, 2012-06-02=1, 2016-01-23=1, 2011-05-28=1, 2018-01-27=1, 2012-04-28=1, 2017-02-25=1, 2011-05-21=1, 2018-01-20=1, 2014-03-01=1, 2013-03-30=1, 2015-04-18=1, 2016-03-19=1, 2012-05-05=1, 2016-03-12=1, 2011-06-04=1, 2017-03-04=1, 2013-03-16=1, 2015-04-11=1, 2018-01-13=1, 2013-03-23=1, 2015-04-04=1, 2014-03-08=1, 2016-03-26=1, 2012-05-12=1, 2018-02-17=1, 2017-02-04=1, 2012-04-07=1, 2011-04-30=1, 2018-02-10=1, 2014-03-22=1, 2013-04-20=1, 2014-03-15=1, 2015-03-28=1, 2012-04-14=1, 2016-02-27=1, 2017-02-11=1, 2011-05-14=1, 2013-04-06=1, 2015-03-21=1, 2017-02-18=1, 2018-02-03=1, 2013-04-13=1, 2014-03-29=1, 2015-03-14=1, 2016-03-05=1, 2012-04-21=1, 2011-05-07=1, 2015-05-30=1, 2016-11-05=1, 2017-04-01=1, 2012-03-17=1, 2014-01-18=1, 2018-08-18=1, 2011-10-15=1, 2017-04-08=1, 2014-01-11=1, 2011-10-22=1, 2013-08-03=1, 2012-03-24=1, 2014-12-27=1, 2017-04-15=1, 2016-10-29=1, 2015-05-23=1, 2011-10-01=1, 2014-01-25=1, 2011-10-08=1, 2018-08-04=1, 2016-10-22=1, 2018-08-11=1, 2013-07-27=1, 2011-09-24=1, 2015-05-16=1, 2013-07-20=1, 2012-03-31=1, 2016-10-15=1, 2017-03-11=1, 2012-02-25=1, 2017-03-18=1, 2014-02-01=1, 2011-09-10=1, 2013-08-24=1, 2014-02-08=1, 2011-09-17=1, 2012-03-03=1, 2015-05-09=1, 2016-09-17=1, 2016-10-08=1, 2015-05-02=1, 2017-03-25=1, 2018-08-25=1, 2014-02-22=1, 2016-10-01=1, 2013-08-17=1, 2014-02-15=1, 2015-04-25=1, 2011-09-03=1, 2013-08-10=1, 2016-09-24=1, 2012-03-10=1, 2012-02-04=1, 2016-12-17=1, 2015-07-11=1, 2017-05-13=1, 2016-12-10=1, 2011-08-20=1, 2013-06-22=1, 2017-05-20=1, 2011-08-27=1, 2014-11-15=1, 2012-02-11=1, 2017-05-27=1, 2012-02-18=1, 2015-07-04=1, 2013-06-08=1, 2016-12-03=1, 2013-06-15=1, 2014-11-29=1, 2016-01-09=1, 2011-08-13=1, 2016-01-02=1, 2015-06-27=1, 2014-11-22=1, 2012-01-14=1, 2015-06-20=1, 2017-04-29=1, 2017-04-22=1, 2016-11-26=1, 2011-07-30=1, 2012-12-29=1, 2013-07-13=1, 2014-12-06=1, 2011-08-06=1, 2012-01-21=1, 2014-12-20=1, 2016-11-19=1, 2017-05-06=1, 2015-06-13=1, 2012-01-28=1, 2014-01-04=1, 2013-06-29=1, 2016-11-12=1, 2013-07-06=1, 2011-07-23=1, 2015-06-06=1, 2014-12-13=1, 2011-01-22=1, 2016-07-23=1, 2015-08-22=1, 2017-06-24=1, 2014-09-20=1, 2014-09-27=1, 2018-05-26=1, 2012-12-08=1, 2013-11-02=1, 2014-10-04=1, 2017-07-01=1, 2011-01-15=1, 2013-11-09=1, 2016-07-16=1, 2017-07-08=1, 2018-05-19=1, 2012-01-07=1, 2016-07-30=1, 2015-08-15=1, 2018-05-12=1, 2012-12-22=1, 2011-12-31=1, 2012-12-15=1, 2013-10-26=1, 2014-10-18=1, 2011-01-29=1, 2015-08-08=1, 2014-10-11=1, 2016-07-02=1, 2015-08-01=1, 2011-01-01=1, 2015-10-03=1, 2017-06-03=1, 2011-12-17=1, 2013-11-30=1, 2018-06-16=1, 2011-12-24=1, 2012-11-17=1, 2013-11-23=1, 2014-10-25=1, 2017-06-10=1, 2016-06-25=1, 2017-06-17=1, 2015-10-10=1, 2018-06-09=1, 2015-07-25=1, 2015-10-17=1, 2018-06-02=1, 2011-12-03=1, 2012-12-01=1, 2012-11-24=1, 2013-11-16=1, 2011-12-10=1, 2014-11-08=1, 2011-01-08=1, 2015-07-18=1, 2016-07-09=1, 2014-11-01=1, 2017-08-05=1, 2011-11-26=1, 2014-08-16=1, 2018-07-07=1, 2014-08-09=1, 2012-10-27=1, 2013-09-14=1, 2017-08-12=1, 2016-09-10=1, 2016-08-27=1, 2017-08-19=1, 2015-09-26=1, 2014-08-23=1, 2018-06-23=1, 2011-11-19=1, 2012-11-10=1, 2012-11-03=1, 2013-09-07=1, 2018-06-30=1, 2015-09-19=1, 2013-08-31=1, 2016-09-03=1, 2016-08-13=1, 2015-09-12=1, 2017-07-15=1, 2014-08-30=1, 2011-11-05=1, 2014-09-06=1, 2018-07-28=1, 2012-09-22=1, 2011-11-12=1, 2013-10-12=1, 2012-10-06=1, 2017-07-22=1, 2012-09-29=1, 2013-10-19=1, 2016-08-06=1, 2017-07-29=1, 2016-08-20=1, 2015-09-05=1, 2014-09-13=1, 2018-07-14=1, 2011-10-29=1, 2012-10-20=1, 2013-09-28=1, 2013-10-05=1, 2012-10-13=1, 2018-07-21=1, 2015-08-29=1, 2013-09-21=1}

Column: gre
Type: num
N: 400.0
Sum: 235080.00
Min: 220.0
Pct25: 520.0
Mean: 587.70
Median: 580.0
Pct75: 660.0
Std Dev: 115.52
Max: 800.0

Frequency counts for 'status': {Active=196, Inactive=116, Other=88}

date
<str>
[7]

2011-01-01
2011-01-08
2011-01-15
2011-01-22
2011-01-29

rank
<num>
[4]

3
3
1

Value of myNumCol at position 354: 540.0
Value of myStrCol at position 123: Active
