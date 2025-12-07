void main() throws IOException {
    List<String> lines = Files.readAllLines(Path.of("input.txt"));
    int cnt = 0;
    for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
            if (lines.get(i).charAt(j) != '@') continue;
            int adj = 0;
            for (int di = -1; di <= 1; di++) {
                for (int dj = -1; dj <= 1; dj++) {
                    if (di == 0 && dj == 0) continue;
                    int ni = i + di, nj = j + dj;
                    if (ni >= 0 && ni < lines.size()) {
                        if (nj >= 0 && nj < lines.get(ni).length() && lines.get(ni).charAt(nj) == '@') {
                            adj++;
                        }
                    }
                }
            }
            if (adj < 4) cnt++;
        }
    }
    IO.print(cnt);
}
