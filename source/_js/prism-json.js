Prism.languages.json = {
    'keyword': /("(\b|\B)[\w-]+"(?=\s*:)|<[a-z]+>)/ig,
    'string': /"(?!:)(\\?[^'"])*?"(?!:)/g,
    'number': /\b-?(0x[\dA-Fa-f]+|\d*\.?\d+([Ee]-?\d+)?)\b/g,
    'function': {
        pattern: /[a-z0-9_]+\(/ig,
        inside: {
            punctuation: /\(/
        }
    },
    'punctuation': /[{}[\]);,]/g,
    'operator': /:/g,
    'boolean': /\b(true|false)\b/gi,
    'null': /\bnull\b/gi
};
