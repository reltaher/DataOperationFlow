package io.github.reltaher;

import com.opencsv.exceptions.CsvException;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException, CsvException {
    CsvParser csvParser = new CsvParser("src/data/SEOExample.csv");
    csvParser.printCsv();
  }
}
