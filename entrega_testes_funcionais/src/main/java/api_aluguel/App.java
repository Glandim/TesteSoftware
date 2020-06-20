package api_aluguel;

import org.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.utils.URIBuilder;

public class App {
    public static void main(String[] args) {
        System.out.println("Gabriel Augusto Landim");
        System.out.println("A API 'aluguebug' esta sendo usada nessa aplicacao para afim de concluir a atividade proposta de testes funcionais");
        
        Controle entrada = new Controle();
        System.out.println("Insira o valor do aluguel: (Ex: 360,00)");
        float valor_nominal = entrada.Valor_Nominal();
        System.out.println("Insira o dia do pagamento do aluguel: ");
        int dia = entrada.Dia();

        float aluguel = App.calcula(dia, valor_nominal);
        
        System.out.printf("\n %.2f", aluguel);
    }

    public static float calcula(int dia, float valor_nominal){
        try {
            Aluguel aluguel = new Aluguel();
            aluguel.dia = dia;
            aluguel.valor_nominal = valor_nominal;

            JSONObject jsonBuilder = new JSONObject(aluguel);
            String params = jsonBuilder.toString();
            
            CloseableHttpClient httpclient = HttpClients.createDefault();
            URIBuilder builder = new URIBuilder("https://aluguebug.herokuapp.com/calc");
            builder.setParameter("dados", params);

            HttpGet httpGet = new HttpGet(builder.build());
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            try {
                HttpEntity entity1 = response1.getEntity();
                String result = EntityUtils.toString(response1.getEntity());
                EntityUtils.consume(entity1);

                result = result.split("\\{")[1];
                result = result.split("\\}")[0];
                result = "{" + result + "}";
                result = result.replace("\\\"", "");

                JSONObject my_obj = new JSONObject(result);

                float resultado = (float) my_obj.getDouble("valor_calculado");
                return resultado;
            } catch (Exception e) {
                System.out.println(e);
            } 
            finally {
                response1.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
}