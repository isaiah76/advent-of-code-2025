void main() throws IOException {
    var input = Files.readString(Path.of("input.txt")).trim().split(",");
    long sum = 0L;
    for (var r : input) {
        var num = r.split("-");
        for (long i = Long.parseLong(num[0]); i <= Long.parseLong(num[1]); i++) {
            String s = Long.toString(i);
            if (s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2))) sum += i;
        }
    }
    IO.print(sum);
}