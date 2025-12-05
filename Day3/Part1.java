void main() throws IOException{
    var input = Files.readString(Path.of("input.txt")).trim();
    int sum = 0;
    for (var s : input.split("\\R")){
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length(); j++){
                int val = (s.charAt(i) - '0') * 10 + (s.charAt(j) - '0');
                if (val > max) max = val;
            }
        }
        sum += max;
    }
    IO.print(sum);
}