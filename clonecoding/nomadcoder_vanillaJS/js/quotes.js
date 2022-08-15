const quotes = [
    {
        quotes: "늦었다고 생각할수록 이미 늦었다.",
        author: "박명수"
    },
    {
        quotes: "앞에서도 못할말은 뒤에서도 하지말자",
        author: "유재석"
    },
    {
        quotes: "꿈은 없고요, 놀고 싶습니다.",
        author: "박명수"
    },
    {
        quotes: "어? 나한테 뭐라하네?, 화나네?",
        author: "정준하"
    },
    {
        quotes: "집에 돌아왔을때 딱 저런 표정입니다.",
        author: "노홍철"
    },
    {
        quotes: "내가 무언가를 계속하려면 또 무언가를 포기해야만 한다.",
        author: "유재석"
    },
    {
        quotes: "그레이트박이 왜 그레이트박인지 보여주겠다.",
        author: "박명수"
    },
    {
        quotes: "웃지마 민병관!!!",
        author: "정준하"
    },
    {
        quotes: "로니콜먼 완전 어좁이 아니냐?",
        author: "어느 겁없는 네티즌"
    },
    {
        quotes: "홍철없는 홍철팀",
        author: "박명수"
    }

];

const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todayQuote = quotes[Math.floor(Math.random() * quotes.length)];

quote.innerText = todayQuote.quotes;
author.innerText = todayQuote.author;