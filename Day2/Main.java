void main() throws IOException{
    var input = Files.readString(Path.of("input.txt")).trim().split(",");
    long sum = 0L;
    for (var s : input){
        var num = s.split("-");
        for (long i = Long.parseLong(num[0]); i <= Long.parseLong(num[1]); i++){
            var numStr = Long.toString(i);
            if (numStr.substring(0, numStr.length() / 2).equals(numStr.substring(numStr.length() / 2))) sum += i;
        }
    }
    IO.print(sum);
}