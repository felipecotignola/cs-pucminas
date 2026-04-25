import java.util.Scanner;
import java.io.File;
//CLASS DATA
class Data{
    private int ano,mes,dia;
    public Data(int ano,int mes,int dia){
        this.ano=ano;
        this.mes=mes;
        this.dia=dia; 
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    public int getAno(){
        return ano;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public static Data parseData(String linha){
        String a="",m="",d="";
        int i=0;
        while(i<linha.length() && linha.charAt(i)!='-' ){
            char letra=linha.charAt(i);
            a+=letra;
            i++;
        }
        i++;
        while(i<linha.length() && linha.charAt(i)!='-' ){
            char letra=linha.charAt(i);
            m+=letra;
            i++;
        }
        i++;
        while(i<linha.length() && linha.charAt(i)!='-' ){
            char letra=linha.charAt(i);
            d+=letra;
            i++;
        }
        int ano=Integer.parseInt(a);
        int mes=Integer.parseInt(m);
        int dia=Integer.parseInt(d);
        return new Data(ano,mes,dia);
    }
    public String formatar(){
        String d = "";
        String m = "";
        if(dia < 10){
            d = "0" + dia;
        }
        else {
            d = "" + dia;
        }
        if(mes < 10){
            m = "0" + mes;
        }
        else {
        m = "" + mes;
        }
    return d + "/" + m + "/" + ano;
}
}
//CLASS HORA
class Hora{
    private int hora,minuto;
    public Hora(int hora,int minuto){
        this.hora=hora;
        this.minuto=minuto;
    }

    public void setHora(int hora){
        this.hora=hora;
    }
    public void setMinuto(int minuto){
        this.minuto=minuto;
    }


    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public static Hora parseHora(String linha){
        String h="",m="";
        int i=0;
        while(i<linha.length() && linha.charAt(i)!=':'){
            char letra=linha.charAt(i);
            h+=letra;
            i++;
        }
        i++;
        while(i<linha.length()){
            char letra=linha.charAt(i);
            m+=letra;
            i++;
        }
        int hora=Integer.parseInt(h);
        int minuto=Integer.parseInt(m);
        return new Hora(hora,minuto);
    }
    public String formatar(){
        String h = "";
        String m = "";
        if(hora < 10){
            h = "0" + hora;
        } 
        else{
            h = "" + hora;
        }
        if(minuto < 10){
            m = "0" + minuto;
        } 
        else{
        m = "" + minuto;
        }
        return h + ":" + m;
    }
}
//CLASS RESTAURANTE
class Restaurante{
    private int id,capacidade;
    private double avaliacao;
    private String[] tiposCozinha;
    private String nome,cidade,faixaPreco;;
    private Hora horarioAbertura,horarioFechamento;
    private Data dataAbertura;
    private boolean aberto;
    public Restaurante(int id,int capacidade,String faixaPreco,double avaliacao,String[] tiposCozinha,String nome,String cidade,Hora horarioAbertura,Hora horarioFechamento,Data dataAbertura,boolean aberto  ){
        this.id=id;
        this.capacidade=capacidade;
        this.faixaPreco=faixaPreco;
        this.avaliacao=avaliacao;
        this.tiposCozinha=tiposCozinha;
        this.nome=nome;
        this.cidade=cidade;
        this.horarioAbertura=horarioAbertura;
        this.horarioFechamento=horarioFechamento;
        this.dataAbertura=dataAbertura;
        this.aberto=aberto;
        
    }
    public void setId(int id){
        this.id=id;
    }
    public void setCapacidade(int capacidade){
        this.capacidade=capacidade;
    }
    public void setFaixaPreco(String faixaPreco){
        this.faixaPreco=faixaPreco;
    }
    public void setAvaliacao(double avaliacao){
        this.avaliacao=avaliacao;
    }
    public void setTiposCozinha(String[] tiposCozinha){
        this.tiposCozinha=tiposCozinha;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public void setHorarioAbertura(Hora horario){
        horarioAbertura=horario;
    }
    public void setHorarioFechamneto(Hora horario){
        horarioFechamento=horario;
    }
    public void setDataAbertura(Data data){
        dataAbertura=data;
    }
    public void setAberto(boolean aberto){
        this.aberto=aberto;
    }
    public int getId(){
        return id;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public String getFaixaPreco(){
        return faixaPreco;
    }
    public double getAvaliacao(){
        return avaliacao;
    }
    public String[] getTiposCozinha(){
        return tiposCozinha;
    }
    public String getNome(){
        return nome;
    }
    public String getCidade(){
        return cidade;
    }
    public Hora getHorarioAbertura(){
        return horarioAbertura;
    }
    public Hora getHorarioFechamento(){
        return horarioFechamento;
    }
    public Data getDataAbertura(){
        return dataAbertura;
    } 
    public boolean getAberto(){
        return aberto;
    }
    public static Restaurante parseRestaurante(String linha){
            int id=Integer.parseInt(parseAuxiliar.parseComum(linha,0));
            String nome=parseAuxiliar.parseComum(linha,1);
            String cidade=parseAuxiliar.parseComum(linha,2);
            int capacidade=Integer.parseInt(parseAuxiliar.parseComum(linha,3));
            double avaliacao=Double.parseDouble(parseAuxiliar.parseComum(linha,4));
            String[] tiposCozinha=parseAuxiliar.parseTiposCozinha(parseAuxiliar.parseComum(linha,5));
            String faixaPreco=parseAuxiliar.parseComum(linha, 6);
            String horario=parseAuxiliar.parseComum(linha, 7);
            int pos=horario.indexOf('-');
            String aberturaStr=horario.substring(0,pos);
            String fechamentoStr=horario.substring(pos+1);
            Hora horarioAbertura=Hora.parseHora(aberturaStr);
            Hora horarioFechamento=Hora.parseHora(fechamentoStr);
            Data dataAbertura=Data.parseData(parseAuxiliar.parseComum(linha, 8));
            Boolean aberto=Boolean.parseBoolean(parseAuxiliar.parseComum(linha, 9));
            return new Restaurante(id,capacidade,faixaPreco,avaliacao,tiposCozinha,nome,cidade,horarioAbertura,horarioFechamento,dataAbertura,aberto);
    }
    public String formatar(){
        String tipos="";
        for(int i=0;i<tiposCozinha.length;i++){
            tipos+=tiposCozinha[i];
            if(i<tiposCozinha.length-1){
                tipos+=",";
            }
        }
        return "[" + id + " ## " + nome + " ## " + cidade + " ## " + capacidade + " ## " + avaliacao + " ## [" + tipos + "] ## " + faixaPreco + " ## " + horarioAbertura.formatar() + "-" + horarioFechamento.formatar() + " ## " + dataAbertura.formatar() + " ## " + aberto; 
    }
        
}
//CLASS COLECAO RESTAURANTE
class ColecaoRestaurantes{
    private int tamanho;
    private Restaurante[] colecaoRestaurantes;
    public ColecaoRestaurantes(int n){
        this.tamanho=n;
        colecaoRestaurantes= new Restaurante[tamanho];
    }
    public void setRestaurante(int i,Restaurante r){
        colecaoRestaurantes[i]=r;
    }
    public int getTamanho(){
        return tamanho;
    }
    public Restaurante[] getRestaurantes(){
        return colecaoRestaurantes;
    }
    public Restaurante buscaId(int id){
        for(int i=0;i<tamanho;i++){
            if(colecaoRestaurantes[i].getId()==id){
                return colecaoRestaurantes[i];
            }
        }
        return null;
    }
}
//CLASS AUX
class parseAuxiliar{
public static String parseComum(String linha,int elemento){
        String string="";
        int elementoAtual=0;
        for(int i=0;i<linha.length();i++){
            char c=linha.charAt(i);
            if(c==','){
                elementoAtual++;
            }
            else if(elementoAtual==elemento){
                string+=c;
            }
        }
        return string;
    }

    public static String[] parseTiposCozinha(String linha){
        int n=1;
        for(int i=0;i<linha.length();i++){
            if(linha.charAt(i)==';'){
                n++;
            }
        }
        String[] tipos=new String[n];
        int tipoAtual=0;
        for(int i=0;i<linha.length();i++){
            String string="";
            while(i<linha.length() && linha.charAt(i)!=';'){
                char letra=linha.charAt(i);
                string+=letra;
                i++;
            }
            tipos[tipoAtual]=string;
            tipoAtual++;
        }
        return tipos;
    }
}

public class q1 {  
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("/tmp/restaurantes.csv"));
        sc.nextLine();
        int qtd=0;
        while(sc.hasNextLine()){
            sc.nextLine();
            qtd++;
        }
        sc.close();
        sc=new Scanner(new File("/tmp/restaurantes.csv"));
        sc.nextLine();
        ColecaoRestaurantes colecao=new ColecaoRestaurantes(qtd);
        int i=0;
        while(sc.hasNextLine() ){
            String linha=sc.nextLine();
            Restaurante r= Restaurante.parseRestaurante(linha);
            colecao.setRestaurante(i, r);
            i++;
        }
        sc.close();
        Scanner entrada=new Scanner(System.in);
        int id=entrada.nextInt();
        while(id!=-1){
            Restaurante r=colecao.buscaId(id);
            if(r!=null){
                System.out.println(r.formatar());
            }
            id=entrada.nextInt();

        }
    }
}
