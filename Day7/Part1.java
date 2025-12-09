void main() throws IOException{
    List<String> input = Files.readAllLines(Path.of("input.txt"));
    Set<Integer> c0 = Set.of(input.get(0).indexOf('S'));
    int cnt = 0;
    for (int i = 1; i < input.size(); i++){
        Set<Integer> c1 = new HashSet<>();
        for (int j : c0){
            if (input.get(i).charAt(j) == '^'){
                cnt++;
                c1.add(j - 1);
                c1.add(j + 1);
            } else {
                c1.add(j);
            }
        }
        c0 = c1;
    }
    IO.print(cnt);
}