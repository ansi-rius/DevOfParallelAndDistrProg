package sorryIdontKnowHowToNameIt;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import java.io.IOException;

public class AirportsTableMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override protected
    void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //читать таблицы..
        String codesAndAirports[] = TablesParser.parseAirportsTable(value); //результат парсинга таблицы,
        //работа с ключами..
        AirportKey ak = new AirportKey()
    }
}
