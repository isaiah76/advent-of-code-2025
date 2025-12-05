void main() throws IOException {
    var input = Files.readString(Path.of("input.txt")).trim().split(",");
    long sum = 0L;
    for (var s : input) {
        var num = s.split("-");
        for (long i = Long.parseLong(num[0]); i <= Long.parseLong(num[1]); i++) {
            if (isRepeating(i)) sum += i;
        }
    }
    IO.print(sum);
}

boolean isRepeating(long num) {
    String s = Long.toString(num);
    if (s.length() % 2 != 0) return false;
    for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(i + s.length() / 2)) return false;
    }
    return true;
}