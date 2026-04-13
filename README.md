# FTC Robot | Controle

O objetivo deste projeto era fazer o robô se movimentar utilizando 4 motores.

## Sobre o projeto

O código foi desenvolvido em Java utilizando o SDK da FTC.  
Nele, o robô utiliza quatro motores DC:

- Frente Direita
- Frente Esquerda
- Trás Direita
- Trás Esquerda

Os motores do lado esquerdo foram invertidos para corrigir o sentido de rotação e permitir que o robô se mova corretamente.

## Funcionalidades

- Controle de 4 motores
- Suporte para movimentação omnidirecional
- Leitura dos analógicos do controle
- Movimento para frente e para trás
- Movimento lateral
- Rotação
- Exibição de dados no telemetry para debug

## Estrutura do código

O programa:

1. Faz o mapeamento dos motores no hardware
2. Inverte os motores do lado esquerdo
3. Aguarda o início da execução
4. Lê os comandos do controle
5. Calcula a potência de cada roda
6. Normaliza os valores para não ultrapassar o limite permitido
7. Envia a potência para os motores

## Controles

- **Analógico esquerdo vertical** → frente e trás
- **Analógico esquerdo horizontal** → movimento lateral
- **Analógico direito horizontal** → rotação

## Tecnologias utilizadas

- Java
- FTC SDK
- Android Studio / OnBot Java
- Driver Hub

## Objetivo de aprendizado

Este projeto foi importante para entender melhor:

- controle de motores DC
- lógica de movimentação do robô
- funcionamento de rodas omni/mecanum
- uso de variáveis para direção e rotação
- normalização de potência dos motores

<img width="1536" height="1024" alt="imgftc" src="https://github.com/user-attachments/assets/909d4261-cefd-4011-8de5-2710ba83f08c" />

## X e Y

![plano-cartesiano](https://github.com/user-attachments/assets/3bcb4b73-65f9-4a96-afcd-6a6f95836e40)

