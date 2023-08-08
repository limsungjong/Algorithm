function solution(s) {
    var answer = '';
    
    answer = s.length % 2 == 0 ? 
        `${s[Math.ceil(s.length / 2) - 1]}${s[Math.ceil(s.length / 2)]}` : 
        s[Math.ceil(s.length / 2) - 1];
    
    return answer;
}