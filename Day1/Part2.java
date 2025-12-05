void main() throws IOException {
    var input = java.nio.file.Files.readAllLines(java.nio.file.Path.of("input.txt"));
    int cnt = 0, pos = 50;
    for (String s : input) {
        int d = Integer.parseInt(s.substring(1));
        boolean r = s.charAt(0) == 'R';
        for (int i = 0; i < d; i++) {
            pos = Math.floorMod(pos + (r ? 1 : -1), 100);
            if (pos == 0) cnt++;
        }
    }
    IO.print(cnt);
}