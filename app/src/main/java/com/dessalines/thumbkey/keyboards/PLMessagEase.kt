package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val TAB_KEY =
    KeyC(
        display = KeyDisplay.TextDisplay("⇥"),
        action = KeyAction.CommitText("\t"),
        color = ColorVariant.MUTED,
    )

val KB_PL_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                    DUMMY_KEY, KeyC('a'), KeyC('-'),
                    KeyC('$'), KeyC('ą'), KeyC('v'),
                ),
                KeyItemC(
                    KeyC('`'), KeyC('ń'), KeyC('´'),
                    KeyC('+'), KeyC('n'), KeyC('!'),
                    KeyC('/'), KeyC('l'), KeyC('\\'),
                ),
                KeyItemC(
                    KeyC('ł'), DUMMY_KEY, DUMMY_KEY,
                    KeyC('?'), KeyC('i'), DUMMY_KEY,
                    KeyC('x'), KeyC('='), KeyC('€'),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('{'), KeyC('ó'), KeyC('%'),
                    KeyC('('), KeyC('w'), KeyC('k'),
                    KeyC('['), KeyC('ć'), KeyC('_'),
                ),
                KeyItemC(
                    KeyC('q'), KeyC('u'), KeyC('p'),
                    KeyC('c'), KeyC('o'), KeyC('b'),
                    KeyC('g'), KeyC('d'), KeyC('j'),
                ),
                KeyItemC(
                    KeyC('|'),
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.MUTED,
                    ),
                    KeyC('}'),
                    KeyC('m'), KeyC('r'), KeyC(')'),
                    KeyC('@'), DUMMY_KEY, KeyC(']'),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('~'), DUMMY_KEY, KeyC('y'),
                    KeyC('<'), KeyC('z'), KeyC('ź'),
                    DUMMY_KEY, KeyC('ę'), TAB_KEY,
                ),
                KeyItemC(
                    KeyC('\"'), KeyC('h'), KeyC('\''),
                    KeyC('ż'), KeyC('e'), KeyC('t'),
                    KeyC(','), KeyC('.'), KeyC(':'),
                ),
                KeyItemC(
                    KeyC('f'), KeyC('&'), KeyC('°'),
                    KeyC('ś'), KeyC('s'), KeyC('>'),
                    KeyC(';'), DUMMY_KEY, DUMMY_KEY,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                    DUMMY_KEY, KeyC('A'), KeyC('-'),
                    KeyC('$'), KeyC('Ą'), KeyC('V'),
                ),
                KeyItemC(
                    KeyC('`'), KeyC('Ń'), KeyC('´'),
                    KeyC('+'), KeyC('N'), KeyC('!'),
                    KeyC('/'), KeyC('L'), KeyC('\\'),
                ),
                KeyItemC(
                    KeyC('Ł'), DUMMY_KEY, DUMMY_KEY,
                    KeyC('?'), KeyC('I'), DUMMY_KEY,
                    KeyC('X'), KeyC('='), KeyC('€'),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('{'), KeyC('Ó'), KeyC('%'),
                    KeyC('('), KeyC('W'), KeyC('K'),
                    KeyC('['), KeyC('Ć'), KeyC('_'),
                ),
                KeyItemC(
                    KeyC('Q'), KeyC('U'), KeyC('P'),
                    KeyC('C'), KeyC('O'), KeyC('B'),
                    KeyC('G'), KeyC('D'), KeyC('J'),
                ),
                KeyItemC(
                    KeyC('|'),
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                        action = KeyAction.ToggleCapsLock,
                        color = ColorVariant.MUTED,
                    ),
                    KeyC('}'),
                    KeyC('M'), KeyC('R'), KeyC(')'),
                    KeyC('@'),
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED,
                    ),
                    KeyC(']'),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('~'), DUMMY_KEY, KeyC('Y'),
                    KeyC('<'), KeyC('Z'), KeyC('Ź'),
                    DUMMY_KEY, KeyC('Ę'), TAB_KEY,
                ),
                KeyItemC(
                    KeyC('\"'), KeyC('H'), KeyC('\''),
                    KeyC('Ż'), KeyC('E'), KeyC('T'),
                    KeyC(','), KeyC('.'), KeyC(':'),
                ),
                KeyItemC(
                    KeyC('F'), KeyC('&'), KeyC('°'),
                    KeyC('Ś'), KeyC('S'), KeyC('>'),
                    KeyC(';'), DUMMY_KEY, DUMMY_KEY,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                    DUMMY_KEY, KeyC('1'), KeyC('-'),
                    KeyC('$'), DUMMY_KEY, DUMMY_KEY,
                ),
                KeyItemC(
                    KeyC('`'), KeyC('^'), KeyC('´'),
                    KeyC('+'), KeyC('2'), KeyC('!'),
                    KeyC('/'), DUMMY_KEY, KeyC('\\'),
                ),
                KeyItemC(
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                    KeyC('?'), KeyC('3'), DUMMY_KEY,
                    DUMMY_KEY, KeyC('='), KeyC('€'),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('{'), DUMMY_KEY, KeyC('%'),
                    KeyC('('), KeyC('4'), DUMMY_KEY,
                    KeyC('['), DUMMY_KEY, KeyC('_'),
                ),
                KeyItemC(
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                    DUMMY_KEY, KeyC('5'), DUMMY_KEY,
                    DUMMY_KEY, DUMMY_KEY, DUMMY_KEY,
                ),
                KeyItemC(
                    KeyC('|'), DUMMY_KEY, KeyC('}'),
                    DUMMY_KEY, KeyC('6'), KeyC(')'),
                    KeyC('@'), DUMMY_KEY, KeyC(']'),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    KeyC('~'), DUMMY_KEY, DUMMY_KEY,
                    KeyC('<'), KeyC('7'), KeyC('*'),
                    DUMMY_KEY, DUMMY_KEY, TAB_KEY,
                ),
                KeyItemC(
                    KeyC('\"'), DUMMY_KEY, KeyC('\''),
                    DUMMY_KEY, KeyC('8'), DUMMY_KEY,
                    KeyC(','), KeyC('.'), KeyC(':'),
                ),
                KeyItemC(
                    DUMMY_KEY, KeyC('&'), KeyC('°'),
                    KeyC('#'), KeyC('9'), KeyC('>'),
                    KeyC(';'), DUMMY_KEY, DUMMY_KEY,
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC('0'),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_PL_MESSAGEASE: KeyboardDefinition =
    KeyboardDefinition(
        title = "polski messagease",
        modes =
            KeyboardDefinitionModes(
                main = KB_PL_MESSAGEASE_MAIN,
                shifted = KB_PL_MESSAGEASE_SHIFTED,
                numeric = KB_PL_MESSAGEASE_NUMERIC,
            ),
    )
