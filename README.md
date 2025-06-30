<h1>CalculadoraDiferente - Testes Unitários</h1>

<p>
Este projeto contém a implementação da classe <strong>CalculadoraDiferente</strong> e uma bateria de testes unitários usando <strong>Spring Boot</strong> com <strong>JUnit 5</strong>.
</p>

<h2>📂 Estrutura do Projeto</h2>
<ul>
  <li><code>CalculadoraDiferente.java</code> - Classe com os métodos a serem testados</li>
  <li><code>SistematizacaoVvsApplicationTests.java</code> - Classe contendo os métodos de teste</li>
  <li><code>README.md</code> - Este arquivo</li>
  <li><code>pom.xml</code> - Arquivo de configuração do Maven (se aplicável)</li>
</ul>

<h2>✅ Métodos Testados</h2>
<ul>
  <li><strong>inverteNumero(int numero)</strong>
    <ul>
      <li>Testes com números simples, zeros finais, um dígito e zero</li>
    </ul>
  </li>
  <li><strong>fatorial(int numero)</strong>
    <ul>
      <li>Testes com entradas 5, 3, 2 e 1</li>
    </ul>
  </li>
  <li><strong>somaDobro(int a, int b)</strong>
    <ul>
      <li>Testes com valores positivos, zero, negativos e grandes</li>
    </ul>
  </li>
</ul>

<h2>🧪 Métodos de Teste Implementados</h2>
<ul>
  <li><code>contextLoads()</code> - Teste padrão do Spring Boot para verificar o carregamento do contexto da aplicação</li>
  <li><code>TPGTAHC_inverteNumero_DeveInverterNumeroSimples()</code></li>
  <li><code>TPGTAHC_inverteNumero_DeveInverterNumeroComZeroNoFinal()</code></li>
  <li><code>TPGTAHC_inverteNumero_DeveInverterNumeroComUmDigito()</code></li>
  <li><code>TPGTAHC_inverteNumero_DeveInverterZero()</code></li>
  <li><code>TPGTAHC_fatorial_DeveCalcularFatorialDe5()</code></li>
  <li><code>TPGTAHC_fatorial_DeveCalcularFatorialDe3()</code></li>
  <li><code>TPGTAHC_fatorial_DeveCalcularFatorialDe1()</code></li>
  <li><code>TPGTAHC_fatorial_DeveCalcularFatorialDe2()</code></li>
  <li><code>TPGTAHC_somaDobro_DeveCalcularSomaDobroPositivo()</code></li>
  <li><code>TPGTAHC_somaDobro_DeveCalcularSomaDobroComZero()</code></li>
  <li><code>TPGTAHC_somaDobro_DeveCalcularSomaDobroComNegativo()</code></li>
  <li><code>TPGTAHC_somaDobro_DeveCalcularSomaDobroComValoresGrandes()</code></li>
</ul>

<p>
Total de métodos com <code>@Test</code>: <strong>13</strong>
</p>

<h2>🚀 Como Executar os Testes</h2>
<ol>
  <li>Importe o projeto em sua IDE (IntelliJ, Eclipse, VS Code, etc.)</li>
  <li>Verifique se você possui o JDK e o Maven configurados</li>
  <li>Execute a classe <code>SistematizacaoVvsApplicationTests</code> como teste unitário</li>
</ol>

<p>Ou rode pelo terminal:</p>
<pre><code>mvn test</code></pre>

<p>
Este projeto é disponibilizado para fins educacionais.
</p>
