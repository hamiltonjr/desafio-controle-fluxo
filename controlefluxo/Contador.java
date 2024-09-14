package controlefluxo;

public class Contador
{
    public static void main(String[] args)
    {
        int parametro1 = Integer.parseInt(args[0]);
        int parametro2 = Integer.parseInt(args[1]);

        try
        {
            contar(parametro1, parametro2);
        } catch (ParametroInvalidoException e)
        {
            System.out.println(e.getMessage());
        }

    }


    public static void contar(int parametro1, int parametro2)
    {
        if (parametro1 > parametro2)
        {
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int contador=1; contador <= parametro2 - parametro1; contador++)
        {
            System.out.println("Imprimendo o número " + contador);
        }
    }

}
