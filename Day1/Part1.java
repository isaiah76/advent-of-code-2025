void main() throws IOException {
    var input = java.nio.file.Files.readAllLines(java.nio.file.Path.of("input.txt"));
    int cnt = 0, pos = 50;
    for (String s : input) {
        int d = Integer.parseInt(s.substring(1)),
                step = s.charAt(0) == 'R' ? d : -d;
        pos = Math.floorMod(pos + step, 100);
        if (pos == 0)
            cnt++;
    }
    IO.print(cnt);
}