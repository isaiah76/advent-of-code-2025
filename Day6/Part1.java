void main() throws IOException {
    List<String> input = Files.readAllLines(Path.of("input.txt"));
    List<String> nums = input.subList(0, input.size() - 1);
    String[] ops = input.get(input.size() - 1).split("\\s+");
    long total = 0L;
    for (int j = 0; j < ops.length; j++) {
        char op = ops[j].charAt(0);
        long sum = op == '*' ? 1 : 0;
        for (String s : nums) {
            long num = Long.parseLong(s.split("\\s+")[j]);
            sum = (op == '+') ? (sum + num) : (sum * num);
        }
        total += sum;
    }
    IO.print(total);
}