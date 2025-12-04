void main() throws IOException {
  var input = java.nio.file.Files.readAllLines(java.nio.file.Path.of("input.txt"));
  int cnt = 0, pos = 50;
  for (String s: input){
      int d = Integer.parseInt(s.substring(1));
      pos = switch (s.charAt(0)){
          case 'L' -> Math.floorMod(pos - d, 100);
          case 'R' -> Math.floorMod(pos + d, 100);
          default -> pos;
      };
      if (pos == 0) cnt++;
  }
  IO.println(cnt);
}