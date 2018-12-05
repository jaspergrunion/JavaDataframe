import java.util.Date;

public class CSVtoDF {

    public static void main(String[] args) {

        // Read from csv file
        String fileref = "/Users/jlgunnin/Downloads/testfile.csv";
        String[][] rawDFmat = ReadCSV.getRawDF(fileref);

        // Instantiate data frame object
        Dataframe myDF = new Dataframe(rawDFmat);

///*
        // Dataframe describe and print methods
        myDF.describe();

        // Summary statistics and frequency tables for all columns
        myDF.summaryStatistics();

        // Produce output for select columns
        myDF.univStats("gpa");
        myDF.freqCounts("gender");

        // Column printing
        myDF.printCol("gpa", 5);

        // Column access
        double[] gpa = myDF.getNumCol("gpa");
        System.out.println("Value of gpa at position 123: " + gpa[123]);
        System.out.println();

        String[] status = myDF.getStrCol("status");
        System.out.println("Value of status at position 354: " + status[354]);
        System.out.println();

        // Extract a date column and print
        Date[] date = myDF.getDateCol("date", "yyyy-MM-dd");

        // Scatterplot of x vs y
        myDF.scatterPlot("gre", "gpa");
        myDF.scatterPlot("gre", "rank");

        // Time series plot of a numeric column
        myDF.timeSeriesPlot("date", "yyyy-MM-dd", "gpa");
        myDF.timeSeriesPlot("date", "yyyy-MM-dd", "gre");

        // Add column which is the uppercase of the status column
        String[] status2 = new String[myDF.getNrows()];
        for (int r = 0; r < myDF.getNrows(); r++) {
            status2[r] = status[r].toUpperCase();
        }
        Dataframe newDF = myDF.addCol(status2, "status2");
        newDF.describe();

        // Add column which is gre squared and then graph
        double[] gre = myDF.getNumCol("gre");
        double[] gre2 = new double[myDF.getNrows()];
        for (int r = 0; r < myDF.getNrows(); r++) {
            gre2[r] = Math.pow(gre[r], 2);
        }
        Dataframe newDF2 = newDF.addCol(gre2, "gre2");
        newDF2.describe();

        newDF2.scatterPlot("gre", "gre2");

        // Slice dataset by row number
        Dataframe sliceDF = myDF.sliceRows(50, 75);
        sliceDF.describe();

        // Filter to records where gender is "Female"
        Dataframe females = myDF.filterRows("gender", "=", "Female");
        females.describe();
        females.freqCounts("gender");

        // Filter females to records with status "Other"
        Dataframe femalesOther = females.filterRows("status", "=", "Other");
        femalesOther.describe();
        femalesOther.freqCounts("gender");
        femalesOther.freqCounts("status");

        // Filter to records where gre is >= 580
        Dataframe gre580 = myDF.filterRows("gre", ">=", 580);
        gre580.describe();
        gre580.univStats("gre");

        // Random sampling of rows
        Dataframe train = myDF.sampleRows("<=", .7, 1234);
        train.describe();

        Dataframe test = myDF.sampleRows(">", .7, 1234);
        test.describe();

//*/

    }

}
