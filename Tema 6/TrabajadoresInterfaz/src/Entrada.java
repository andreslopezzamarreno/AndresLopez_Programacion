public class Entrada {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("cesjpII", 10000);
        empresa.addPersona(new Asalariado("borja","martin","1213A",1000,Departamento.Comercial,12));
        empresa.addPersona(new Asalariado("martin","borja","1213b",1000,Departamento.Comercial,12));




    }
}
