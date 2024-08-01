function reverseWord(word) 
 {
  let reversed = '';
   for(let i = word.length - 1; i >= 0; i--) 
    {
     reversed += word[i];
    }
    return reversed;
  }

function reverseWordsInSentence(sentence) 
 {    
  let result = '';
   let word = '';
    for (let i = 0; i < sentence.length; i++) 
     {
      let char = sentence[i];
       if (char === ' ') 
        {
         result += reverseWord(word) + ' ';
          word = '';
        } 
       else 
        {
         word += char;
        }
    }   
     result += reverseWord(word);
     return result;
}

const sentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(sentence);
console.log(reversedSentence);