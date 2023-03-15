import com.mariten.kanatools.KanaConverter;

class SampleKanaConverter
{
    public static void main(String[] args)
    {
        // Check for arg input
        if(args.length < 1) {
            System.out.println("EXAMPLE:");
            System.out.println("  java SampleKanaConverter ???");
            return;
        }
        String input_string = args[0];
            System.out.println("  java SampleKanaConverter ﾃｽﾄ");

        // Define conversion ops
        int sample_conversion_ops = 0;
        sample_conversion_ops |= KanaConverter.OP_HAN_KATA_TO_ZEN_KATA;
        sample_conversion_ops |= KanaConverter.OP_ZEN_HIRA_TO_ZEN_KATA;
        sample_conversion_ops |= KanaConverter.OP_ZEN_ASCII_TO_HAN_ASCII;
 System.out.println("EXAMPLE:kkk");
        // Convert and print
        String output_string = KanaConverter.convertKana(input_string, sample_conversion_ops);
        System.out.println(output_string);
    }
}
