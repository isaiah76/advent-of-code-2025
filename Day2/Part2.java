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
    int len = s.length();
    for (int i = 1; i <= len / 2; i++) {
        if (len % i != 0) continue;
        boolean isMatch = true;
        for (int k = i; k < len; k++) {
            if (s.charAt(k) != s.charAt(k - i)) {
                isMatch = false;
                break;
            }
        }
        if (isMatch) return true;
    }
    return false;
}