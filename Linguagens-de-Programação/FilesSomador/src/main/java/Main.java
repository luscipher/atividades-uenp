import java.io.File;

class Main {
    private static long pegarTamanhoPasta(File pasta){

        long tamanho = 0;

        File[] arquivos = pasta.listFiles();

        int count = arquivos.length;

        for (int i = 0; i < count; i++) {
            if (arquivos[i].isFile()) {
                tamanho += arquivos[i].length();
            }else {
                tamanho += pegarTamanhoPasta(arquivos[i]);
            }
        }
        return tamanho;
    }
    public static void main(String[] args){

        File arquivo1 = new File("C:\\Users\\55439\\Documents\\FilesSomador");

        long tamanho1 = pegarTamanhoPasta(arquivo1);

        System.out.println("Tamanho do arquivo é de: " + tamanho1 + " Bytes.");
    }
}