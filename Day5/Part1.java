void main() throws IOException {
    List<String> lines = Files.readAllLines(Path.of("input.txt"));
    List<String> ranges = lines.subList(0, lines.indexOf(""));
    int cnt = 0;
    for (String s : lines.subList(lines.indexOf("") + 1, lines.size())) {
        long id = Long.parseLong(s.trim());
        boolean matched = false;
        for (String r : ranges) {
            String[] parts = r.split("-");
            long strt = Long.parseLong(parts[0]);
            long end = Long.parseLong(parts[1]);
            if (id >= strt && id <= end) {
                matched = true;
                break;
            }
        }
        if (matched) cnt++;
    }
    IO.print(cnt);
}
