package com.example.emidiomorais.sociomatico;

import android.content.Intent;
import android.os.Bundle;
import android.preference.TwoStatePreference;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.emidiomorais.sociomatico.controler.adapter.ListViewAdapter;
import com.example.emidiomorais.sociomatico.controler.core.Internacional;
import com.example.emidiomorais.sociomatico.controler.core.Noticia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar = setTitle(getResources().getString(android.R.string.app_name));
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    public  final  static  String POSITION_NOTICIA ="com.example.emidiomorais.sociomatico.POSITION_NOTICIA";
    public static ArrayList <Noticia> arrayNoticia;

    private ListView ListView;
    private ListViewAdapter adapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arrayNoticia = new ArrayList<Noticia>();
        ListView = (ListView) findViewById(R.id.listview_item);

        adapter = new ListViewAdapter(getApplicationContext());
        for (int i = 0; i <5; i++) {
            noticia1();
            noticia2();
            noticia3();
            noticia4();
            noticia5();

        }
        ListView.setAdapter(adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailNoticia = new Intent(getApplicationContext(),DetailNoticia.class);
                detailNoticia.putExtra(POSITION_NOTICIA,position);
                startActivity(detailNoticia);

            }
        });

        setUpToolbar();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        setUpNavDrawer();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener){
            @Override
                    public boolean OnNavigationItemSelected(MenuItem
            MenuItem menuItem;
            menuItem){
                    menuItem.setChecked(true);
                    switch (menuItem.getItemId)){
                    case R.id.Internacional:
                    //Toast.makeText(getApplicationContext()"Internacional selecionado", Toast.LENGTH_SHORT).show();
                    Intent internacional = new Intent(getApplicationContext(), Internacional.class);
                    startActivity(internacional);

                        break:
                    case  R.id.Sociedade:
                    Toast.makeText(getApplicationContext()"Sociedade selecionado", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Politica:
                    Toast.makeText(getApplicationContext()"Politica selecionado", Toast.LENGTH_SHORT).show();
                            break;
                    case R.id.Economia:
                    Toast.makeText(getApplicationContext()"Economia selecionado", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Desporto:
                    Toast.makeText(getApplicationContext()"Desporto selecionado", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;


            }
        }

    }

    public void noticia1() {

        Noticia noticia = new Noticia();
        noticia.setTituloNoticia("Coreia do Norte usa Moçambique para violar sanções da ONU");
        noticia.setImagemAutor(R.drawable.emidio);
        noticia.setImagemNoticia(R.drawable.porto);
        noticia.setAutorNoticia("Emidio Morais");
        noticia.setDescricaoNoticia("Segundo revela a CNN, as práticas ilícitas acontecem no Porto de Maputo, através de dois barcos ali atracados enferrujados, nomeadamente, Susan 1 e Susan 2. Os barcos são fáceis de mover e camuflar e actualmente ostentam a bandeira da Namíbia, país também apontado como envolvido no esquema.\n" +
                "\n" +
                "A CNN revela ainda que os barcos usaram da pesca para exportar produtos como o carvão, cuja origem é disfarçada com documentação fraudulenta.\n" +
                "\n" +
                "A ONU já tinha reportado anteriormente ligações da Coreia do Norte com Moçambique, que envolviam cerca de 6 milhões de dólares através de uma empresa de fachada chamada Haegeumgang. A CNN revela ter localizado o edifício cor de salmão onde antes funcionava a empresa. Esta encontra-se na avenida Mao Tse-tung, em Maputo.\n" +
                "\n" +
                "O dinheiro é canalizado através de diplomatas norte-coreanos na região para Pyongyang. Oficiais norte-americanos sustentam que o dinheiro resultantes de parcerias de negócio vão diretamente para o fundo secreto nuclear do líder norte-coreano, King Jong-Un, conhecido como Office 39.\n" +
                "\n" +
                "A ONU impõs novas sancões à Coreia do Norte em Dezembro último, numa resolução em que proibia quase 90% das exportações para o país e exigiu o repatriamento de norte-coreanos que trabalhavam fora do país, dentro de 24 meses. As sanções surgiram como medida de isolamento, para travar os frequentes lançamentos de mísseis balísticos da Coreia do Norte.\n" +
                "\n" +
                "Ainda no ano passado, Moçambique já tinha sido acusado pelo Conselho de Segurança da ONU, de estar envolvido na compra de armamento da Coreia do Norte. Na altura, o ministro da Defesa Nacional, Atanásio M’tumuke, refutou todas as acusações,\n" +
                "\n" +
                "M’tumuke foi apoiado pelo então ministro dos Negócios Estangeiros e Cooperação, Oldemiro Balói, que negou qualquer compra de equipamentos militares da Coreia do Norte, tendo admitido, no entanto, que Moçambique recebeu apoio militar da Coreia do Norte.");

        arrayNoticia.add(noticia);
        adapter.addItem(noticia);

    }

    public void noticia2() {
        Noticia noticia = new Noticia();
        noticia.setTituloNoticia("Vítimas da lixeira de Hulene reclamam de morosidade no reassentamento");
        noticia.setImagemAutor(R.drawable.elton);
        noticia.setImagemNoticia(R.drawable.vitimaslixeiradehulene);
        noticia.setAutorNoticia("Elton Chauque");
        noticia.setDescricaoNoticia("Por outro lado, é a falta de privacidade uma vez que chegam a partilhar a mesma tenda cerca de 20 pessoas.\n" +
                "\n" +
                "“Aqui as pessoas estão mais preocupadas em abandonar as tendas o mais rápido possível e começar a nova vida em Possulane. Cada tenda leva mais ou menos 20 pessoas e isso rouba privacidade a cada um dos ocupantes. É verdade que não falta o que comer e o que beber, mas se estivéssemos lá a vida não seria esta. Também está em curso o levantamento de dados de todos os acolhidos neste centro para se apurar quem deve ou não receber os terrenos uma vez que há um ligeiro conflito entre os inquilinos e proprietários das residências destruídas”, comentava Elina Sigaúque, representante das vítimas.\n" +
                "\n" +
                "Já foram parcelados em Possulane os terrenos para acomodar as vítimas da tragédia de Hulene\n" +
                "Depois do trágico deslizamento de lixeira de Hulene na sequência das chuvas intensas que caíam na semana do dia 19 de Fevereiro passado, na cidade e arredores da cidade de Maputo, são várias as forças que foram activadas no sentido de apoiar as vítimas que ficaram sem teto, para além de terem perdido os seus familiares, que totalizaram 16 óbitos.\n" +
                "\n" +
                "Decorridos um pouco mais de 30 dias, o Conselho Municipal de Maputo, na pessoa do seu presidente, David Simango, veio ao público dizer que continuava o processo de parcelamento de terrenos num espaço identificado em Possulane, distrito de Marracuene, na província de Maputo e que já tinham sido parcelados mais de 406 terrenos.\n" +
                "\n" +
                "Seguir-se-ia à fase de abertura de ruas para, entre outros fins, permitir a construção das fontes de água uma vez que no mesmo espaço deve-se iniciar a edificação das respectivas casas. Esta segunda-feira, O País deslocou-se à Possulane onde ficou a saber através dos nativos e residentes daquele ponto que foram integrados no parcelamento, que o mesmo processo terminou na quarta-feira da semana finda, faltando ainda a abertura das vias de acesso.\n" +
                "\n" +
                "“O parcelamento terminou no dia 21 de Fevereiro, quarta-feira da semana passada, e aqui foram parcelados muitos terrenos. Para nós o parcelamento é bem-vindo uma vez que o nosso bairro terá mais residentes e desta forma irá crescer. É bom ainda porque será desbravada esta terra que neste momento é o habitat de serpentes”, revelou um residente de Possulane, de nome Jaime Mazive.\n" +
                "\n" +
                "Paralelamente a este processo de reassentamento definitivo das cerca de 300 famílias que encontram-se acolhidas nos centros dos bairros Ferroviário e Albazine, a multinacional Mozal disponibilizou cerca de sete milhões de meticais que foram canalizados para a compra de material de construção que compreende essencialmente sacos de cimento, chapas de zinco do tipo IBR e barrotes.");

        arrayNoticia.add(noticia);
        adapter.addItem(noticia);
    }

    public void noticia3() {
        Noticia noticia = new Noticia();
        noticia.setTituloNoticia("Nicki Minaj e rapper Nas já não são um casal");
        noticia.setImagemAutor(R.drawable.eloi);
        noticia.setImagemNoticia(R.drawable.nickiminajerappernas);
        noticia.setAutorNoticia("Eloi Bartolomeu");
        noticia.setDescricaoNoticia("Os dois artistas estavam juntos desde o verão do ano passado.\n" +
                "\n" +
                " Nicki Minaj entrou em 2018 livre e descomprometida. Segundo o site TMZ, a rapper já não namora com Nas há algum tempo, mas só agora fontes próximas do ex-casal revelaram a separação.\n" +
                "\n" +
                "Os dois artistas estavam juntos desde o último verão e a causa do término do relacionamento terá sido o facto de viverem em cidades diferentes. A mesma publicação adianta ainda que a separação foi amigável e que ambos mantém uma boa relação.\n" +
                "\n" +
                "Na sequência do fim da relação, foram também desmentidos os rumores de gravidez da rapper, assegura o TMZ. Por agora, as prioridades de Nicki são os projetos musicais, nomeadamente o lançamento do seu próximo álbum.");

        arrayNoticia.add(noticia);
        adapter.addItem(noticia);

    }

    public void noticia4() {

        Noticia noticia = new Noticia();
        noticia.setTituloNoticia("Encontrada solução para quem ressona? Eis uma almofada anti-ronco");
        noticia.setImagemAutor(R.drawable.hd);
        noticia.setImagemNoticia(R.drawable.antironco);
        noticia.setAutorNoticia("Hermenegildo Nhamussua");
        noticia.setDescricaoNoticia("Todos já passaram por isto: Não conseguir adormecer porque o companheiro do lado está a roncar tão alto que parece que temos um avião a levantar voo mesmo na nossa cama.\n" +
                "\n" +
                "\n" +
                "O resultado? Noites mal dormidas e níveis de stress elevados.\n" +
                "\n" +
                "A solução pode estar prestes a chegar e é mais simples do que possa parecer. A Aldi acaba de colocar à venda uma série de almofadas com diferentes especificações, sendo uma delas anti-ronco.\n" +
                "\n" +
                "Escreve o Mirror que não está certo da eficácia da almofada, mas que a marca alega que esta foi “especialmente desenhada para manter a cabeça levantada durante o sono permitindo que as vias respiratórias estejam abertas, garantindo uma noite sem barulhos”.\n" +
                "\n" +
                "A almofada estará, para já, à venda apenas no Reino Unido mas se quer muito adquiri-la pode sempre encomendá-la online.\n" +
                "\n" +
                "© Aldi\n" +
                "\n" +
                "Sabemos que o Natal já passou mas talvez seja uma boa oportunidade de oferecer um ‘presente’ a essa pessoa que lhe anda a roubar horas de descanso.");

        arrayNoticia.add(noticia);
        adapter.addItem(noticia);
    }
    public  void noticia5 (){

        Noticia noticia = new Noticia();
        noticia.setTituloNoticia("Criança de sete anos algemada depois de esmurrar professora");
        noticia.setImagemAutor(R.drawable.zeca);
        noticia.setImagemNoticia(R.drawable.crianca);
        noticia.setAutorNoticia("Zeca Sampaio");
        noticia.setDescricaoNoticia("Foi a segunda vez que o menino demonstrou comportamento agressivo desde o início do ano letivo.\n" +
                "A semana passada um menino de sete anos teve de ser algemado e retirado da escola depois de, pela segunda vez este ano letivo, ter demonstrado um comportamento agressivo.\n" +
                "\n" +
                "\n" +
                " O último episódio de violência protagonizado pela criança foi na quinta-feira passada, quando uma professora lhe disse para parar de brincar com a comida no refeitório da escola, conta a Associated Press.\n" +
                "\n" +
                "A criança recusou-se a parar e foi quando foi mandado sair do local, começou a agredir repetidamente a professora com murros e pontapés. Os dois acabaram por cair no chão.\n" +
                "\n" +
                "As autoridades foram chamadas e o rapaz acabou por ser internado no hospital infantil de Miami, por indicar que podia ser uma ameaça para si próprio ou para outros.\n" +
                "\n" +
                "Foi a segunda vez que os agentes tiveram de recorrer a algemas para imobilizar o menor.\n" +
                "\n" +
                "O pai do menino concordou com o tratamento a que este foi sujeito, mas a mãe disse que o filho não tem qualquer tipo de doença mental e diz que a criança foi sujeito a “abuso policial”.\n" +
                "\n" +
                "Depois de dizer que lhe doíam as costas, a professora agredida informou os agentes da polícia que pretende apresentar queixa");

        arrayNoticia.add(noticia);
        adapter.addItem(noticia);
    }

    private void setUpToolbar (){
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar = setTitle(getResources().getString(android.R.string.app_name));

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().show();
    }

    private void setUpNavDrawer(){

        if(toolbar != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(R.drawable.ic_info_white);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    drawerLayout.openDrawer(GravityCompat.START);

                }
            });


        }

    }
}
