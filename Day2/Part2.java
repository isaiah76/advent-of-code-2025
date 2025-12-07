void main() throws IOException {
    var input = Files.readString(Path.of("input.txt")).trim().split(",");
    long sum = 0L;
    for (var s : input) {
        var num = s.split("-");
        for (long i = Long.parseLong(num[0]); i <= Long.parseLong(num[1]); i++) {
            String str = Long.toString(i);
            boolean repeating = false;
            for (int p = 1; p <= str.length() / 2; p++) {
                if (str.length() % p != 0) continue;
                boolean match = true;
                for (int k = p; k < str.length(); k++) {
                    if (str.charAt(k) != str.charAt(k - p)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    repeating = true;
                    break;
                }
            }
            if (repeating) sum += i;
        }
    }
    IO.print(sum);
}